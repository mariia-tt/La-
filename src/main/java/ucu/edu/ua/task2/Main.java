package ucu.edu.ua.task2;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder()
            .name("Name")
            .age(100)
            .email("rttata@gmail.com")
            .sex("Male")
            .build();
        
        MailCode birthdayCode = new BirthdayMailCode();
        MailInfo mailInfo1 = new MailInfo(client, birthdayCode);

        MailInfo mailInfo2 = new MailInfo(client, 
            client1 -> "It is just a random mail!");

        MailSender mailSender = new MailSender();
        MailBox mailBox = new MailBox(mailSender);

        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        System.out.println("Birthday mail: " + mailInfo1.generate());
        System.out.println("Random mail: " + mailInfo2.generate());

        mailBox.sendAll();
    }
}

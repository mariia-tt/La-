package ucu.edu.ua.tasktwo;

public class Main {
    private static final int MY_AGE = 20;

    public static void main(String[] args) {
        Client client = Client.builder()
            .name("Name")
            .age(MY_AGE)
            .email("rttata@gmail.com")
            .sex("Male")
            .build();

        MailCode birthdayCode = new BirthdayMailCode();
        MailInfo birthdayMail = new MailInfo(client, birthdayCode);

        MailInfo randomMail = new MailInfo(client, 
            client1 -> "It is just a random mail!");

        MailSender mailSender = new MailSender();
        MailBox mailBox = new MailBox(mailSender);

        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(randomMail);

        System.out.println("Birthday mail: " + birthdayMail.generate());
        System.out.println("Random mail: " + randomMail.generate());

        mailBox.sendAll();
    }
}

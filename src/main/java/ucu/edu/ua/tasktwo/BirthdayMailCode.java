package ucu.edu.ua.tasktwo;

public class BirthdayMailCode implements MailCode {
    public String generate(Client client) {
        return String.format("Dear %s! Happy %d birthday!",
        client.getName(), client.getAge());
    }
}

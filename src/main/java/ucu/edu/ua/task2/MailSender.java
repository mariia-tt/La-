package ucu.edu.ua.task2;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class MailSender {
    private static final String SMTP_HOST = "your.smtp.host";
    private static final String SMTP_PORT = "2525";  //port
    private static final String SMTP_USERNAME = "rarigu";
    private static final String SMTP_PASSWORD = "trarar";
    private static final String FROM_EMAIL = "traarar@gmail.com";

    public void sendMail(MailInfo mailInfo) {
        Properties props = new Properties();
        props.put("mail.smtp.host", SMTP_HOST);
        props.put("mail.smtp.port", SMTP_PORT);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(SMTP_USERNAME, SMTP_PASSWORD);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FROM_EMAIL));
            message.setRecipients(Message.RecipientType.TO, 
                InternetAddress.parse(mailInfo.getClient().getEmail()));
            message.setSubject("Important Message");
            message.setText(mailInfo.generate());

            Transport.send(message);
            System.out.println("Email sent successfully." + 
                mailInfo.getClient().getEmail());

        } catch (MessagingException e) {
            System.out.println("Failed to send email: " + e.getMessage());
        }
    }
}
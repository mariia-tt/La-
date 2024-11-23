package ucu.edu.ua.tasktwo;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class MailBox {
    private final List<MailInfo> infos = new ArrayList<>();
    private final MailSender mailSender;

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo mailInfo : infos) {
            mailSender.sendMail(mailInfo);
        }
        infos.clear();
    }
}
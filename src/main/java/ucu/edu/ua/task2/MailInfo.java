package ucu.edu.ua.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }    
}

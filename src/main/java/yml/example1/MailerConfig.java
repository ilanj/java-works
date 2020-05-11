package yml.example1;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MailerConfig implements Serializable{
    private CredentialsConfig creds;
    private String sender;
    private List<String> recipients;
}

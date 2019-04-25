package yml.example1;
import lombok.Data;

@Data
public class AppConfig {
    private MailerConfig mailer;
    private String version;
    private String env;
}

package yml.example1;

import lombok.Data;

import java.util.Map;

@Data
public class CredentialsConfig {
    private Map<String, String> props;
    private String mailId;
    private String password;
}

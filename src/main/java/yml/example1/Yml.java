package yml.example1;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Yml {
    public static void main(String[] args) {

            AppConfig appConfig = null;
            Yaml yaml = new Yaml();
            try( InputStream in = Files.newInputStream( Paths.get("config.yml") ) ) {
                appConfig = yaml.loadAs( in, AppConfig.class );
                printData(appConfig);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    static void printData(AppConfig appConfig)
    {
        System.out.println(appConfig.getEnv());
        System.out.println(appConfig.getMailer().getRecipients());
        System.out.println(appConfig.getVersion());
    }
}

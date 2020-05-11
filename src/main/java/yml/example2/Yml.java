package yml.example2;

import org.yaml.snakeyaml.Yaml;
import yml.example1.AppConfig;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Yml {
    public static void main(String[] args) {

            Model model = null;
            Yaml yaml = new Yaml();
            try( InputStream in = Files.newInputStream( Paths.get("config1.yml") ) ) {
                model = yaml.loadAs( in, Model.class );
                printData(model);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    static void printData(Model model)
    {
        System.out.println(model.name);
       model.marks.forEach(m-> System.out.println(m));
    }
}

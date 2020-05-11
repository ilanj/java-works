package j8utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReadText {
    public static void main(String[] args) throws IOException {
readText();
readFolder();
    }
    static void readText() throws IOException {
        String content;
        content = new String(Files.readAllBytes(Paths.get("src/main/java/j8utils/content.txt")));
        List<String> docids= Arrays.asList(content.split("\n"));
    }
    public static void readFolder() {
        List<Path> fileNames= new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get("/home/ila/Documents/ocr/19 class ORC output"))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(fileName->{
                        fileNames.add(fileName);
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}

package strings.regex;

public class ExtractNos {
    public static void main(String[] args) {
        String name="Thread-4";
        System.out.println(name.replaceAll("\\D",""));
    }
}

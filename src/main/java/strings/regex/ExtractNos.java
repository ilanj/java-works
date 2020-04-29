package strings.regex;

public class ExtractNos {
    public static void main(String[] args) {
        String name="Thread-4";
        System.out.println(name.replaceAll("\\D",""));
        System.out.println(name);

        String expected = "Gil. Joel";
        expected = expected.replaceAll("[^a-zA-Z]"," ").replaceAll(" ","").toLowerCase();
        System.out.println(expected);
    }
}

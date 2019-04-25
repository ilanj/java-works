package strings.regex;

public class RemoveSpecialcharString {
    public static void main(String[] args) {
        String str="   haai       welcome, to ^87 java.";
        System.out.println(str.replaceAll("[^\\w\\s]"," "));
        //remove spaces
        System.out.println(str.trim().replaceAll(" +"," "));

    }
}

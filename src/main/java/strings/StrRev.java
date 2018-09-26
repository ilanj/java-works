package strings;

public class StrRev {
    public static void main(String[] args) {
        String name="ilanchezhian";

        StringBuilder s=new StringBuilder();
        s.append(name);
        s.reverse();
        System.out.println("name="+name);
        name=s.toString();
        System.out.println("name="+name);


    }
}

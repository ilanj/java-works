package programs.basicprograms;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Newflame {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first Name:");
        String name1 = sc.nextLine();
        int name1len = name1.length();

        System.out.println("Enter the Second Name:");
        String name2=sc.nextLine();
        int name2len=name2.length();

        for(int i=0; i<name1len; i++) {
            for(int j=0; j<name2len; j++) {
                if(name1.charAt(i)==name2.charAt(j))
                {
                    name1=name1.replaceFirst(String.valueOf(name1.charAt(i)), "#");
                    name2=name2.replaceFirst(String.valueOf(name2.charAt(j)), "#");
                }
            }

        }

        String name3=name1.replace("#", "")+name2.replace("#", "");
        int name3len=name3.length();

        String match="Flames";
        String mat[];
        int matchlen;

        while(match.length()!=1)
        {
            name3len = name3.length();
            if(name3len!= 0) {
                matchlen = match.length();
                if(name3len > matchlen)
                    name3len = name3len%match.length();
                if(name3len == 0)
                    name3len = matchlen;
                match= match.replace(String.valueOf(match.charAt(name3len-1)), "#");
                mat= match.split("#");
                String s3;
                if(mat.length== 2)
                    s3=mat[1]+ mat[0];
                else
                    s3=mat[0];
                match=s3;
            }}

        switch (match.toLowerCase()) {
            case "f":
                System.out.println("Friends");
                break;
            case "l":
                System.out.println("Love");
                break;
            case "a":
                System.out.println("Affection");
                break;
            case "m":
                System.out.println("Marriage");
                break;
            case "e":
                System.out.println("Enemies");
                break;
            case "s":
                System.out.println("Sibling");
                break;


        }

    }

}
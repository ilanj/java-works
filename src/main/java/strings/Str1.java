package strings;

import demo.Str;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String name;
        System.out.println("enter any name");
        name=in.nextLine();

        //charAt()
        char ch;
        ch=name.charAt(3);
        System.out.println("char at 3"+ch);

        //length
        int length;
        length=name.length();
        System.out.println("length of "+name+" = "+length);

        //Substring
        String sub=name.substring(1,5);
        System.out.println("substring="+sub);

        //contains
        boolean contains;
        String s="ila";
        contains=name.contains(s);
        System.out.println(name+" contains "+s+ " returns "+contains);

        //lower and upper
        System.out.println("to upper"+name.toUpperCase());
        System.out.println("aback to lower"+name.toLowerCase());

        //trim
        name=name.trim();
        System.out.println("after trim"+name);

        //replace
        name=name.replace(" ","");
        System.out.println("after replace  "+name);

        //split
        System.out.println("splitting with space");
        String[] splitArray;
        splitArray=name.split(" ");

//      int len;
//        len=splitArray.length;
//        for(int i=0;i<len;i++)
//            System.out.println(splitArray[i]);

    for(String s1:splitArray)
        System.out.println(s1);
        //to char array
        System.out.println("printing as a char array");
        char ca[];
        ca=name.toCharArray();

        for(char c:ca)
            System.out.println(c);

        //string comparison
        String s2=" jcbjqbcq";
        if(name.equals(s2))
            System.out.println("equal");
        else
            System.out.println("not equal");

        //string builder
        StringBuilder sb=new StringBuilder();

        for(String s1:splitArray)
        {
            sb.append(s1);
        }
        sb=sb.reverse();
        System.out.println("after reverse using string builder"+sb.toString());

        //string concatenation
        System.out.println("concatenated string= "+name.concat(s2));
    }
}

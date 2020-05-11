package programs.basicprograms;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //0.5*b*h
        double b;
        double h;
        double area;

        System.out.println("enter breadth od triangle");
        b=in.nextDouble();
        System.out.println("enter height od triangle");
        h=in.nextDouble();

        area=0.5*b*h;

        System.out.println("area of triangle="+area);

    }
}

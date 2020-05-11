package programs.basicprograms;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        //2*3.14*r
        Scanner in=new Scanner(System.in);
        double r;
        double circumference;
        System.out.println("enter radius");
        r=in.nextDouble();
        circumference=2*3.14*r;
        System.out.println("citcumference of circle="+circumference);
    }
}

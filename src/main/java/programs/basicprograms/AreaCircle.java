package programs.basicprograms;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //3.14*r*r
        double r;
        double area;
        System.out.println("enter radius");
        r=in.nextDouble();
        area=3.14*r*r;
        System.out.println("area of circle for radius "+r+"= "+area);

    }
}

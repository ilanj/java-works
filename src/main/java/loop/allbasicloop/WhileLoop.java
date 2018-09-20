package loop.allbasicloop;

import java.util.Scanner;

//printing first n nos
public class WhileLoop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int i=0;
        while(i<25)
        {
            System.out.println(i);
            i++;//i+i+1
        }
        System.out.println("loop break");
    }
}

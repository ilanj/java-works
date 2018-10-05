package branching;

import java.util.Scanner;

//illustrate grade system
//>100-s,  >90 -A,  >80-B,   >70-C,  >60-D,  >50-E,  50<-U
public class ElseIfLadder {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int mark;

        System.out.println("enter mark");
        mark=in.nextInt();

        if(mark==100)
            System.out.println(" S grade");
        else if(mark>90)
            System.out.println("A grade");
        else if(mark>80)
            System.out.println("B grade");
        else if(mark>70)
            System.out.println("C grade");
        else if(mark>60)
            System.out.println("D grade");
        else if(mark>50)
            System.out.println("E grade");
        else
            System.out.println("Fail");


    }
}

package exception;

import java.awt.*;
import java.io.FileNotFoundException;

public class ExceptionEg extends Throwable {
    public static void main(String[] args) throws InterruptedException {

        int a,b,c;
        a=10;
        b=0;
        try
        {
            System.out.println(a/b);
            System.out.println("hhrrrai");
            System.out.println("ryhryh");

            System.out.println("rhrh");

            System.out.println("hrh");

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("i will aways execute");
        }
        //Thread.sleep(500);


        System.out.println("hai");
        System.out.println("hai");

        System.out.println("hai");

        System.out.println("hai");



    }
}

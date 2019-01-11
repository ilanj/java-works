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
            c=a/b;
            System.out.println(c);
        }
        catch(ClassCastException cl)
        {
            cl.printStackTrace();
        }
        catch(ClassFormatError cm)
        {
            cm.printStackTrace();
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println(" thus is finally");
        }
        //Thread.sleep(500);


        System.out.println("hai");
        System.out.println("hai");

        System.out.println("hai");

        System.out.println("hai");



    }
}

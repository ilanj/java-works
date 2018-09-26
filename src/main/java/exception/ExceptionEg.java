package exception;

import java.awt.*;
import java.io.FileNotFoundException;

public class ExceptionEg extends Throwable {
    public static void main(String[] args) {

        int a,b,c;
        a=10;
        b=0;

        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch (ArrayIndexOutOfBoundsException ar)
        {
            ar.printStackTrace();
        }
        catch (ClassCastException cl)
        {
            cl.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("hai");
        System.out.println("hai");

        System.out.println("hai");

        System.out.println("hai");



    }
}

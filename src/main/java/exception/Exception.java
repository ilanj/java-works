package exception;

import java.awt.*;

public class Exception extends Throwable {
    public static void main(String[] args) {

        int a,b,c;
        a=10;
        b=0;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch (IllegalMonitorStateException e)
        {
            System.out.println("second exception");
        }catch(java.lang.Exception g)
        {
            System.out.println("3rd exception");
        }


    }
}

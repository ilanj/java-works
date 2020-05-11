package programs.basicprograms;

public class RoundOff {
    public static void main(String[] args) {

       long l=1542369;
       double d=longToRoundedDouble(l);
        System.out.println(d);
    }
     static double longToRoundedDouble(Long time)
    {
        double timeInSeconds=(double)time;
        timeInSeconds=(double) timeInSeconds/1000;
        timeInSeconds=Math.round(timeInSeconds*100D)/100D;
        return timeInSeconds;

    }
}

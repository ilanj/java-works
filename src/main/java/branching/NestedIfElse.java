package branching;
//to check whether a no is divisible by both 3 and 5
public class NestedIfElse {
    public static void main(String[] args) {
        int n=10;

        if(n%3==0)
        {
            if (n%5==0)
            {
                System.out.println("divisible by both 3 and 5");
            }
            else
                System.out.println("only divisible by 3");
        }
        else
        {
            if (n%5==0)
            {
                System.out.println("divisible by 5 slone");
            }
            else
                System.out.println("not divisibly by both 3 and 5");
        }
    }
}

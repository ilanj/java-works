package collections.list;

import java.util.ArrayList;

public class ContinueBreakInList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        for(int i=0;i<15;i++)
        {
            al.add(i);
        }

        al.forEach(n-> {

            if(n==5)


            System.out.println(n);
        });
    }
}

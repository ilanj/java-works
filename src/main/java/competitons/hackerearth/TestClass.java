package competitons.hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class TestClass {
    static         Scanner in = new Scanner(System.in);
    static ArrayList<Integer> result = new ArrayList();

    public static void main(String[] args) {
        Integer tc = in.nextInt();
        for(int i=0; i<tc; i++){
            compute();
        }
        result.forEach(System.out::println);

    }
    static void compute(){
        Integer n = in.nextInt();
        Integer k = in.nextInt();
        ArrayList<Integer> nos = new ArrayList();
        ArrayList<Integer> frequency = new ArrayList();
        for(int i=0; i<n; i++){
            Integer temp = in.nextInt();
            nos.add(temp);
        }

//        for(int )
        int[][] table = new int[k][n];
        int[][] index = new int[k][2];

        for(int i=0;i<k;i++)
        {
            for (int j=0;j<2;j++)
            {
                index[i][j]=in.nextInt();
            }
        }

        for(int i=0;i<k;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(j>=(index[i][0])-1 && j <=(index[i][1])-1)
                    table[i][j]=1;
                else
                    table[i][j]=0;

            }
        }



        for(int i=0;i<n;i++)
        {
            int sum = 0;

            for (int j=0;j<k;j++)
            {
                sum = sum + table[j][i];
            }
            frequency.add(sum);
        }
        //calculate alice sum
        int alice = 0;
        for(int i=0;i<nos.size();i++){
            alice =alice + nos.get(i) * frequency.get(i);
        }
        //calculate b sum
        Collections.sort(nos, Collections.reverseOrder());
        Collections.sort(frequency, Collections.reverseOrder());
        int bob = 0;
        for(int i=0;i<nos.size();i++){
            bob =bob + nos.get(i) * frequency.get(i);
        }
        result.add(bob - alice);

    }
}

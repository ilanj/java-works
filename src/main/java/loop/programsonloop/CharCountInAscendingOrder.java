package loop.programsonloop;
//display in scending order
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharCountInAscendingOrder {
    public static void main(String[] args) {
        Map<Character,Integer> map=new TreeMap<>();
        int count=0;
        Scanner in=new Scanner(System.in);
        String s="azazazjcndjkcbdicnwkjvfjvbevjk";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            count=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                    ++count;
            }
            map.put(ch[i],count);
        }

        map.forEach((k,v)-> System.out.println(k+"  "+v));
        }


}

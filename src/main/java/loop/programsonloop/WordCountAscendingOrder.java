package loop.programsonloop;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCountAscendingOrder {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        int count=0;
        Scanner in=new Scanner(System.in);
        String s="hi all hi welcome to java world abi";
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++)
        {
            count=0;
            for(int j=0;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                    ++count;
            }
            map.put(words[i],count);
        }

        map.forEach((k,v)-> System.out.println(k+"  "+v));
    }


}

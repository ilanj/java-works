package buffer;

import java.util.*;
import java.util.stream.Collectors;

public class ListEx {
    public static void main(String[] args) {
        Map<Character,Integer> map=new TreeMap<>();
        map.put('a',1);
        map.put('a',2);
        map.put('a',3);

        map.forEach((k,v)-> System.out.println(k+"  "+v));

    }
}

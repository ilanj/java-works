package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> names = new ArrayList<>();
        names.add(new ArrayList<>(Arrays.asList("sssss")));
        System.out.println();
    }
}

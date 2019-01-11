package strings;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StrRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        name = StringUtils.normalizeSpace(name);
        System.out.println(name);

        String name2 = "xhcd";

        StringBuilder sb = new StringBuilder();
        sb.append("haai");
        sb.append(" welcome");
        System.out.println(sb.toString());
        System.out.println(sb.reverse().toString());
    }
}

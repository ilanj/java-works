package programs.basicprograms;

import java.util.Stack;

public class StackEx {
        public static void main(String[] args) {
            java.util.Stack st=new java.util.Stack();
            st.push(34);
            st.push("fwfw");
            st.push(45);
            for(Object ob:st)
                System.out.println(ob);
            System.out.println(st.peek());


        }
    }
package june16;

import java.util.*;

public class Demo {
   static void showpush(Stack stack1, int a) {
      stack1.push(new Integer(a));
      System.out.println("push(" + a + ")");
      System.out.println("stack: " + stack1);
   } 
   static void showpop(Stack stack1) {
      Integer a = (Integer) stack1.pop();
      System.out.println(a);
      System.out.println("stack: " + stack1);
   } 
   public static void main(String args[]) 
   {
      Stack stack1 = new Stack();
      if(stack1.empty())
    	  System.out.println("empty stack");
      stack1.push(11);
      System.out.println("stack: " + stack1);
      /*showpush(stack1, 40);
      showpush(stack1, 50);
      showpush(stack1, 60);
      showpop(stack1);
      showpop(stack1);
      showpop(stack1); */
      try {
         showpop(stack1);
      } catch (EmptyStackException e) {
         System.out.println("it Is Empty Stack");
      } 
   }
}
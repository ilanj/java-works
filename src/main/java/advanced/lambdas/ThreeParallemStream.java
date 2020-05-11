package advanced.lambdas;

import java.util.ArrayList;
import java.util.List;
//https://www.logicbig.com/tutorials/core-java-tutorial/java-util-stream/sequential-vs-parallel.html
//parallel stream is done in selenium for reference
public class ThreeParallemStream {
    public static void main(String[] args) {
        List nos=new ArrayList();
        List filteredNos=new ArrayList();
        nos.add(1);
        nos.add(2);
        nos.add(3);
        nos.add(4);
        nos.add(5);
        nos.add(6);
//replace with parallel stream-threading will print elements arbitrarily
        nos.parallelStream().forEach(e->{
            //                Thread.sleep(2500);
            System.out.print(e+"\t");
            System.out.println(Thread.currentThread().getName());
        });
    }
}

package advanced.lambdas.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListImplementations {
    public static void main(String[] args) {
        ModelData m;
        List<ModelData> al;
        List<ModelData> temp=new ArrayList<>();
        List<ModelData> temp2=new ArrayList<>();

        al= Arrays.asList(
                m=new ModelData(25,"ilan","pondicherry"),
                m=new ModelData(14,"bala","jayamkondan"),
                m=new ModelData(36,"murugan","hosur"),
                m=new ModelData(12,"mozhi","cuddalore"),
                m=new ModelData(87,"raja","sivakasi"),
                m=new ModelData(52,"aravind","thirukoilur")
        );

        al.forEach(e-> System.out.println(e.id+"  "+e.name+"  "+e.location));
        ModelData search=al.stream().
                            filter(e->e.id.equals(12)).
                            findFirst().orElse(null);


        temp=al.parallelStream().
                filter(foo->foo.id>20).
                collect(Collectors.toList());

        System.out.println(temp);
        //Stream<ModelData> temp1=al.stream().filter(foo->foo.id>20).map(ModelData::new);
    }
}

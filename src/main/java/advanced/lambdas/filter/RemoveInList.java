package advanced.lambdas.filter;

import com.google.gson.internal.$Gson$Preconditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveInList {
    public static void main(String[] args) {
        ModelData m;
        ArrayList<ModelData> al = new ArrayList<>();
        List<ModelData> temp=new ArrayList<>();
        List<ModelData> temp2=new ArrayList<>();


                al.add(new ModelData(25,"ilan","pondicherry"));
                al.add(new ModelData(14,"bala","jayamkondan"));
                al.add(new ModelData(36,"murugan","hosur"));
                al.add(new ModelData(12,"mozhi","cuddalore"));
                al.add(new ModelData(87,"raja","sivakasi"));
                al.add(new ModelData(52,"aravind","thirukoilur"));


//       al.removeIf(each->each.getName().equals("ilan"));
       al.remove(al.parallelStream().filter(each->each.getName().equals("ilan")));
        System.out.println(al);
        //Stream<ModelData> temp1=al.stream().filter(foo->foo.id>20).map(ModelData::new);
    }
}

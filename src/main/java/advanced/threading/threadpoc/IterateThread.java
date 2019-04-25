//package advanced.threading.threadpoc;
//
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.TreeMap;
//
//public class IterateThread {
//    static Model m=new Model(LocalTime.now(),"cc","d");
//    static List<Model> models=new ArrayList<>();
//    static TreeMap<Integer, Model> map=new TreeMap<>();
//
//    public static void main(String[] args) {
//        map.put(1,new Model());
//        map.put(2,new Model());
//        map.put(3,new Model());
//
//        for(int i=0;i<map.size();i++)
//        {
//            new Thread(()->
//            {
//                map.get(models);
//            });
//        }
//    }
//}

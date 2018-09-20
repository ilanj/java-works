package oops.encapsulation;

public class testEncapsulation {
    public static void main(String[] args) {

        StudentDetail s=new StudentDetail();
        StudentDetail s2;
        s.setAvg(4.64);
        s.setRollNo(25);
        s.setName("ila");

        s2=s.getData(s);
        System.out.println(s2.getName());
    }
}

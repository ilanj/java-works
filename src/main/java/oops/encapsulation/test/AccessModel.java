package oops.encapsulation.test;

public class AccessModel {

    public static void main(String[] args) {
        Model m=new Model();
        m.setAge(26);
        System.out.println(m.getAge());

        Model m1=new Model();
        m1.setAge(27);
        System.out.println(m1.getAge());
    }

}

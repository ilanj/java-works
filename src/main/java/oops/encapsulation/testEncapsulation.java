package oops.encapsulation;

import vk.Data;

public class testEncapsulation {
    public static void main(String[] args) {
        StudentDetail s=new StudentDetail();


//        StudentDetail s=new StudentDetail();
//
//        StudentDetail s2;
//        s.setAvg(4.64);
//        s.setRollNo(25);
//        s.setName("ila");
//
//        s2=s.getData(s);
//        System.out.println(s2.getName());
        print();
    }

    static void print()
    {
        StudentDetail s=new StudentDetail();
        s.setRollNo(25);
        System.out.println(s.getRollNo());
//        s.setAvg(23.23);
//        s.setName("aakash");
//        s.setRollNo(56);
//        StudentDetail temp;
//        temp=s.getData(s);
        //StudentDetail d=Data.studentAdd(s);
    }

}

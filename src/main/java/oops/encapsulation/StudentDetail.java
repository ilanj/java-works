package oops.encapsulation;

import lombok.Data;


public class StudentDetail
{
     private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    private String name;
     private double avg;



    StudentDetail getData(StudentDetail s1)
    {
        System.out.println(s1.getRollNo()+"   "+s1.getAvg()+"  "+s1.getName());
        return  s1;
    }

    void printdata()
    {
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(avg);
    }

}

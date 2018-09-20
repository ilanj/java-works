package oops.encapsulation;

public class StudentDetail {
    private int rollNo;
    private String name;
    private double avg;
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getAvg() {
        return avg;
    }

    StudentDetail getData(StudentDetail s1)
    {
        System.out.println(s1.getRollNo()+"   "+s1.getAvg()+"  "+s1.getName());
        return  s1;
    }




}

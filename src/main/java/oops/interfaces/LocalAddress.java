package oops.interfaces;

public class LocalAddress implements  Address{
    public String address()
    {
        return "Sozhinganallur, Chennai";
    }

    public static void main(String[] args) {
        Address a=new LocalAddress();
        System.out.println(a.address());
    }
}

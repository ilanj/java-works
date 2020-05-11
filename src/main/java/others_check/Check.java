package others_check;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.concurrent.atomic.AtomicInteger;

public class Check {
    @NotEmpty
    private String template;
    private String name;

    private String no;

    private AtomicInteger a=new AtomicInteger();
    public static void main(String[] args) {

    Check c=new Check(null);
        System.out.println(    c.a.incrementAndGet());
        System.out.println(    c.a.incrementAndGet());
        System.out.println(    c.a.addAndGet(45));
        System.out.println(c.name);
        System.out.println(c.no);




    }

    Check(String template)
    {
        this.template=template;
        System.out.println(template);
    }
}

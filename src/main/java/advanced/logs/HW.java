package advanced.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class HW {
    private static final Logger log = LoggerFactory.getLogger(HW.class);


    public static void main(String[] args) {
        System.out.println("fefwef");
        log.info("my first log");
        log.debug("debugging");
        log.error("error");

    }
}

package advanced.threading.threadpoc;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Model {
    private LocalTime time1;

    public Model(LocalTime time1, String time2, String time3) {
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
    }

    private String time2;
    private String time3;

}

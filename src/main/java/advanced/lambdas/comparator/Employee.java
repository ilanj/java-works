package advanced.lambdas.comparator;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;
@Data
@AllArgsConstructor
class Employee {
    private int id;
    private String name;
    private double salary;
    private LocalDate joiningDate;




}
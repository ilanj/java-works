package advanced.lambdas.filter;

import lombok.Data;

@Data
public class ModelData {
    Integer id;
    String name;
    String location;

    public ModelData(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
}

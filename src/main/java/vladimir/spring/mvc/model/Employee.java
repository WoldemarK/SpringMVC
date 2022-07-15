package vladimir.spring.mvc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;
    private String carBrand;

    private Map<String,String> departments;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("HR","Human Resources");
        departments.put("Sales","Sales");

    }
}

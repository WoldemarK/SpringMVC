package vladimir.spring.mvc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;


}

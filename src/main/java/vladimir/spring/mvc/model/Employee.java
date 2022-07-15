package vladimir.spring.mvc.model;

import lombok.Data;

import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

@Data
public class Employee {

    @Size(min = 2,message = "name must be min 2 symbols")
    private String name;
    private String surname;
    private int salary;
    private String department;
    private String carBrand;
    private String[] languages;
    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private Map<String, String> languageMap;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Toyota", "Toyota");

        languageMap = new HashMap<>();
        languageMap.put("EN", "English");
        languageMap.put("DE", "Deutsch");
        languageMap.put("FR", "French");

    }
}

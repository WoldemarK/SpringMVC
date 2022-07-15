package vladimir.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import vladimir.spring.mvc.model.Employee;

import javax.validation.Valid;

@Controller
public class MeController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/ask")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    /**
     * как пример
     */
//    @RequestMapping("/show")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }


//    @RequestMapping("/show")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", "- java developer");
//
//        return "show-emp-details-view";
//    }
    @RequestMapping("/showEmpDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee) {
        String name = employee.getName();
        employee.setName("Mr. " + name);

        String surname = employee.getSurname();
        employee.setSurname(surname);

        int salary = employee.getSalary();
        employee.setSalary(salary * 2);

        return "show-emp-details-view";
    }
}

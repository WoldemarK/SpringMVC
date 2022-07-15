package vladimir.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MeController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/ask")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    /**
     * как пример
     */
//    @RequestMapping("/show")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }

    /**
     * Можно делать через HttpServletRequest
     * @param empName
     * @param model
     * @return
     */
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

    /**
     * Тоже самое что и HttpServletRequest но белее короче через @RequestParam
     * @param empName
     * @param model
     * @return
     */
    @RequestMapping("/show")
    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr. " + empName;

        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", "- java developer");

        return "show-emp-details-view";
    }
}

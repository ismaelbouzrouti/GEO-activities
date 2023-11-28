package GEOActivities.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/Home")
    public String showHome(Model model){

        model.addAttribute("firstMessage","Hello World");
        return "Home";
    }
}

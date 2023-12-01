package GEOActivities.start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    @GetMapping("/Home")

    public  String ShowHomePage(){

        return "Home";
    }
}

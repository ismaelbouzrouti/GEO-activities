package GEOActivities.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginPage(){

        return "login";
    }

    @PostMapping("/login")
    public String submitLoginForm(@ModelAttribute User user, Model model){

        User storedUser = userRepository.findByEmail(user.getEmail());

        if (storedUser!= null && storedUser.getPassword().equals(user.getPassword())){
            return "/Map";
        }else {
            model.addAttribute("errorMessage",true);
            return "/login";
        }
    }
}

package GEOActivities.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/signup")
    public String showSignUpPage(Model model){
        User user = new User();
        model.addAttribute(user);
        return "signup";
    }

    @PostMapping("/signup")
        public String submitSignUpForm(@ModelAttribute("user")User user){
            userRepository.save(user);


            return "signup_succesful";
        }
    }


package GEOActivities.start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MapController {
    @GetMapping("/Map")
    public String showMap(){

        return "Map";
    }
}

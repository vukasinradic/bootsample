package bootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by vukasin on 3/14/17.
 */
@Controller
public class MainController {
    @GetMapping ("/")
    public String home(){
        return "index";
    }
}

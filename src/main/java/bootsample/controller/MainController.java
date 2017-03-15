package bootsample.controller;

import bootsample.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by vukasin on 3/14/17.
 */
@Controller
public class MainController {

    @Autowired
    private TaskService taskService;

    @GetMapping ("/")
    public String home(){
        return "index";
    }
}

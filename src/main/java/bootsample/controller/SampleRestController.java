package bootsample.controller;

import bootsample.model.Task;
import bootsample.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by vukasin on 3/14/17.
 */
@RestController
public class SampleRestController {

    @Autowired
    private TaskService taskService;

    @GetMapping ("/home")
    public String home(){
        return "hello world";
    }
@GetMapping("/all-tasks")
    public String allTasks(){

return taskService.findAll().toString();
    }
@GetMapping("/save-task")
    public String saveTask(@RequestParam String name, @RequestParam String desc){
        Task task= new Task(name, desc, new Date(),false);
        taskService.save(task);
        return "Task saved!";
    }
}

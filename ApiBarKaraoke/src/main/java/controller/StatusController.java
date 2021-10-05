package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StatusController {
    @GetMapping(path = "/")

    public String Check(){
        return "Online";
    }
}

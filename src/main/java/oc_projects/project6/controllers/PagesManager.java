package oc_projects.project6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesManager {

    @GetMapping("/")
    public String DisplayIndex(){
        return "index";
    }
}

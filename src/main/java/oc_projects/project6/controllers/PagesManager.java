package oc_projects.project6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesManager {

    @GetMapping("/")
    public String DisplayIndex(){
        return "index";
    }

    @GetMapping("/listeSites")
    public String DisplaySiteList(){
        return "listeSites";
    }

    @GetMapping("/connexion")
    public String DisplayConnexion(){
        return "connexion";
    }

    @GetMapping("/inscription")
    public String DisplayInscription(){
        return "inscription";
    }
}

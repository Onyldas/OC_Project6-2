package oc_projects.project6.controllers;

import oc_projects.project6.entity.Utilisateur;
import oc_projects.project6.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo {

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    @GetMapping("/")
    public String sayHello(@RequestParam(required= false, defaultValue = "World") String name, ModelMap modelmap){
        modelmap.put("name", name);
        return "HelloWorld";
    }

    @GetMapping("/test")
    public String test(){
        return "Test";
    }


    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String name) {
        Utilisateur n = new Utilisateur();
        n.setNom(name);
        utilisateurRepository.save(n);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Utilisateur> getUtilisateurs(){
        return utilisateurRepository.findAll();
    }
}

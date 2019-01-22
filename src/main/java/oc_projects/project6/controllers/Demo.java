package oc_projects.project6.controllers;

import oc_projects.project6.entities.Users;
import oc_projects.project6.entities.Comment;
import oc_projects.project6.repositories.CommentRepository;
import oc_projects.project6.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CommentRepository commentRepository;


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
        Users n = new Users();
        n.setPseudo(name);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/addcomment") // Map ONLY GET Requests
    public @ResponseBody String addNewComment (@RequestParam String content) {
       Comment c = new Comment();
       c.content=content;
       commentRepository.save(c);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Users> getUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/allcomments")
    public @ResponseBody Iterable<Comment> getComments(){
        return commentRepository.findAll();
    }

}

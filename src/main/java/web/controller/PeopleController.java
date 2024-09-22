package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
//import web.DAO.CarDAO;
import web.Servise.UserServse;

@Controller
public class PeopleController {


//    private final CarDAO carDao;

    private final UserServse userServse;

    public PeopleController(UserServse userServse) {
        this.userServse = userServse;
    }

    @GetMapping()

//    public String user(@RequestParam(required = false, defaultValue = "10") int count, Model model) {
//        model.addAttribute("user", userServse.getUsers(count));
//        return "user";
//    }

//    public String user(){
//        return "user";
//    }
    public String index(Model model){
        model.addAttribute("people",userServse.getUsers(count));
return null;
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id")int id, Model model){
        return "show";
    }
}

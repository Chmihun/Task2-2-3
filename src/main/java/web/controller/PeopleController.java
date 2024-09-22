package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
//import web.DAO.CarDAO;
import web.DAO.PersonDAO;
import web.Servise.UserServse;
import web.model.Person;

@Controller
public class PeopleController {
    private final PersonDAO personDAO;

    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("people", personDAO.index());
        return "index";
    }

    @GetMapping("/people/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        Person person = personDAO.show(id);
        if (person != null) {
            model.addAttribute("person", person);
            return "show";
        } else {
            model.addAttribute("error", "Человек не найден");
            return "error"; // взглянуть на страницу ошибки
        }
    }
}

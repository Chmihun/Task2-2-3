package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.PathVariable;
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
        model.addAttribute("person", person);
        return "show";

    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") Person person) {
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person) {
        personDAO.save(person);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("person", personDAO.show(id));
        System.out.println("ddddddddddddddddddddddddddd");
        return "edit";
    }

    @PostMapping("/{id}")
    public String update(@ModelAttribute("person") Person person, @PathVariable("id") int id) {
        personDAO.update(id, person);
        System.out.println("updateffffffffffffffffffffffffffffff");
        return "redirect:/";
    }
    @DeleteMapping("/person/{id}")
    public String delete(@PathVariable("id") int id){
        System.out.println("ooooooooooo");
        personDAO.delete(id);
        return "redirect:/";
    }
}

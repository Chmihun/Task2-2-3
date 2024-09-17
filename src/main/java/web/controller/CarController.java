package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
//import web.DAO.CarDAO;
import web.Servise.CarServse;

@Controller
public class CarController {


//    private final CarDAO carDao;
    private final CarServse carService;

    public CarController(CarServse carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(required = false, defaultValue = "10") int count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}

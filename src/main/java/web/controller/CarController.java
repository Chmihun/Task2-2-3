package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.DAO.CarDAO;

@Controller
public class CarController {
    private final CarDAO carDao;

    public CarController(CarDAO carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public String car(Model model) {
        model.addAttribute("cars", carDao.index()); // Получение списка автомобилей
        return "cars"; // Возвращаем название представления
    }

    @GetMapping("/cars/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("car", carDao.show(id)); // Получение автомобиля по ID
        return "show"; // Возвращаем название представления
    }
}

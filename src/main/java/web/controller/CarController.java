package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.CarService;
import service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {

    CarService carService=new CarServiceImpl();

    @RequestMapping
    public String printCars(Model model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> carList = carService.getCars(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}


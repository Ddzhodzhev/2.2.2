package service;

import org.springframework.context.annotation.Bean;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(Integer count);
}

package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
//    @param счетчик машин
//    @return список машин
    List<Car> getCars(int count);
}

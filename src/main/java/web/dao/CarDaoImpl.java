package web.dao;

import web.model.Car;

import java.util.List;

public class CarDaoImpl implements CarDao {

    List<Car> cars = List.of(
            new Car("Lada", "bakladjan", 2010),
            new Car("Logan", "pink", 2014),
            new Car("Geely", "blue", 2005),
            new Car("Dodge", "Brown", 2019),
            new Car("Volga", "white", 2008)
    );

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}

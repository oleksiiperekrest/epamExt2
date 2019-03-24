package com.company.lesson3.homework3.repository;

import com.company.lesson3.homework3.entity.Car;
import com.company.lesson3.homework3.entity.CarBrand;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private List<Car> cars;

    public CarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getCarById(Long id) {
        for (Car car : cars) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }

}

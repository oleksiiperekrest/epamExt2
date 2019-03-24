package com.company.lesson3.homework3.service;

import com.company.lesson3.homework3.entity.Car;
import com.company.lesson3.homework3.entity.CarBrand;
import com.company.lesson3.homework3.entity.CarModel;
import com.company.lesson3.homework3.repository.CarRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.getCars();
    }

    public Car getCarById(Long id) {
        return carRepository.getCarById(id);
    }

    public List<Car> getCarsByBrand(CarBrand brand) {
        List<Car> result = new ArrayList<>();
        boolean found = false;

        for (Car car : carRepository.getCars()) {
            if (car.getBrand().equals(brand)) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }

    public List<Car> getCarsByModel(CarModel carModel) {
        List<Car> result = new ArrayList<>();
        boolean found = false;

        for (Car car : carRepository.getCars()) {
            if (car.getModel().equals(carModel)) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }


    public List<Car> getCarsByYear(int year) {
        List<Car> result = new ArrayList<>();
        boolean found = false;

        for (Car car : carRepository.getCars()) {
            if (car.getYear().equals(year)) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }

    public List<Car> getCarsByBrandAndOlderThan(CarBrand carBrand, int olderThan) {
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Car> brandCars = getCarsByBrand(carBrand);
        List<Car> result = new ArrayList<>();
        boolean found = false;
        for (Car car : brandCars) {
            if (thisYear - car.getYear() > olderThan) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }

    public List<Car> getCarsByModelAndOlderThan(List<CarModel> carModels, int olderThan) {
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Car> modelCars = new ArrayList<>();
        for (CarModel carModel : carModels) {
            modelCars.addAll(getCarsByModel(carModel));
        }

        List<Car> result = new ArrayList<>();

        boolean found = false;
        for (Car car : modelCars) {
            if (thisYear - car.getYear() > olderThan) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }

    }


    public List<Car> getCarsByYearAndMoreExpensiveThan(int year, int moreExpensive) {
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Car> brandCars = getCarsByYear(year);
        List<Car> result = new ArrayList<>();
        boolean found = false;
        for (Car car : brandCars) {
            if (car.getPrice() > moreExpensive) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }

}

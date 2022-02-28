package com.example.demo.car.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.car.domain.Car;

@Service
public class CarService {

	private List<Car> cars = new ArrayList<>();

	// CREATE
	public Car createCar(Car p) {
		this.cars.add(p);
		Car created = this.cars.get(this.cars.size() - 1);
		return created;
	}

	// READ
	public List<Car> getAllCars() {
		return this.cars;
	}

	public Car getCar(Integer id) {
		return this.cars.get(id);
	}

	// UPDATE
	public Car replaceCar(Integer id, Car newcar) {
		Car body = this.cars.set(id, newcar);
		return body;
	}

	// DELETE
	public void removeCar(@PathVariable Integer id) {
		this.cars.remove(id.intValue());
	}
}

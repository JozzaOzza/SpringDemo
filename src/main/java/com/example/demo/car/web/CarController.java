package com.example.demo.car.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.car.domain.Car;
import com.example.demo.car.service.CarService;

@RestController // tells Spring this is a controller :)
// Rest compliant (Representational State Transfer)
public class CarController {

	private CarService carService;
	
	@Autowired
	public CarController(CarService carService) {
		
		super();
		this.carService = carService;
	}

	@PostMapping("/create") // @RequestBody pulls the parameter from the body of the request

	public ResponseEntity<Car> createCar(@RequestBody Car p) {
		Car created = this.carService.createCar(p);
		ResponseEntity<Car> response = new ResponseEntity<Car>(created, HttpStatus.CREATED); // 201 - created
		return response;
	}
	
	@GetMapping("/getAll") 
	public ResponseEntity<List<Car>> getAllcars() {
		return ResponseEntity.ok(this.carService.getAllCars()); //200 - ok
	}
	
	@GetMapping("/get/{id}")  // 200 ok
	public Car getCar(@PathVariable Integer id) {
		return this.carService.getCar(id);
	}
	@PutMapping("/replace/{id}") // 202 accepted
	public ResponseEntity<Car> replaceCar(@PathVariable Integer id, @RequestBody Car newCar) {
		Car body = this.carService.replaceCar(id, newCar);
		ResponseEntity<Car> response = new ResponseEntity<Car>(body, HttpStatus.ACCEPTED);
		return response;
	}
	@DeleteMapping("/remove/{id}") // 204 no content 
	public ResponseEntity<?> removeCar(@PathVariable Integer id) {
		this.carService.removeCar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
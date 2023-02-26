package com.moussam.designpatterns.creational.builder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Car {

	private int id;
	private String model;
	private String brand;
	private Color color;

	private Car() {
		
	}
	
	public static CarBuilder builder() {
		return new CarBuilder(); 
	}

	public static class CarBuilder{
		
		private Car car; 
		
		public CarBuilder() {
			car = new Car(); 
		}
		
		public CarBuilder withId(int id) {
			car.setId(id);
			return this; 
		}
		
		public CarBuilder withModel(String model) {
			car.setModel(model);
			return this; 
		}
		
		public CarBuilder withBrand(String brand) {
			car.setBrand(brand);
			return this; 
		}
		
		public CarBuilder withColor(Color color) {
			car.setColor(color);
			return this; 
		}
		
		public Car build() {
			return car;  
		}
	}

}

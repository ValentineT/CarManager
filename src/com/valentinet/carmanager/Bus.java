package com.valentinet.carmanager;

public class Bus extends Car {

	public Bus(String modelName, int yearOfProd, int price, int weigth, Color string) {
		super(modelName, yearOfProd, price, weigth, string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		if (distanceOnService >= 50000) {
			return true;
		} else {
			return false;
		}
	}

}

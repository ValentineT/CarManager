package com.valentinet.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String modelName, int yearOfProd, int price, int weigth, Color string) {
		super(modelName, yearOfProd, price, weigth, string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		if (distanceOnService >= 10000) {
			return true;
		} else {
			return false;
		}
	}

}

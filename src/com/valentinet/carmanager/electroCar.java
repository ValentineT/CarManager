package com.valentinet.carmanager;

public class electroCar extends Car {

	public electroCar(String modelName, int yearOfProd, int price, int weigth, Color string) {
		super(modelName, yearOfProd, price, weigth, string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		// TODO Auto-generated method stub
		return false;
	}

}

package com.valentinet.carmanager;

public class CarManager {

	public static void main(String[] args) {

		Car priusToyota = new electroCar("Toyota Prius", 15000, 2008, 1200, Color.GREEN);
		Car camryToyota = new PassengerCar("Toyota Camry", 15000, 2008, 1200, Color.SILVER);

		Car lagunaRenault = new renaultCar("Renault Lagna", 9700, 2000, 1600, Color.WHITE);
		Car hiaceToyota = new Bus("Toyota Hiace", 9700, 2000, 1600, Color.WHITE);

		camryToyota.addDistance(1000);
		camryToyota.addDistance(15000);
		camryToyota.addDistance(-15000);
		lagunaRenault.addDistance(155.77);
		hiaceToyota.addDistance(49000);

		lagunaRenault.serviceReset();

		System.out.println(priusToyota);
		System.out.println(camryToyota);
		System.out.println(lagunaRenault);
		System.out.println(hiaceToyota);
		System.out.println();

// isReadyToService		
		System.out.println("Toyota Camry is ready to service: " + camryToyota.isReadyToService());
		System.out.println("Toyota Hiace is ready to service: " + hiaceToyota.isReadyToService());

//		System.out.println(priusToyota.equals(lagunaRenault2));
//		System.out.println(lagunaRenault.equals(lagunaRenault2));

	}

}

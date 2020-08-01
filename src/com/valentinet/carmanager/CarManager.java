package com.valentinet.carmanager;

public class CarManager {

	public static void main(String[] args) {

		Car priusToyota = new Car("Toyota Prius", 15000, 2008, 1200, Color.GREEN);

		Car lagunaRenault = new Car("Renault Lagna", 9700, 2000, 1600, Color.WHITE);
		Car lagunaRenault2 = new Car("Renault Lagna", 9700, 2000, 1600, Color.WHITE);

		
		
		
		priusToyota.addDistance(1000);
		priusToyota.addDistance(15000);
		priusToyota.addDistance(-15000);
		lagunaRenault.addDistance(155.77);
		
		
		System.out.println(priusToyota);
		System.out.println(lagunaRenault);
		System.out.println(priusToyota.equals(lagunaRenault2));
		System.out.println(lagunaRenault.equals(lagunaRenault2));
	

	}

}

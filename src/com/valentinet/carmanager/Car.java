package com.valentinet.carmanager;

public class Car {
	String modelName;
	int yearOfProd;
	int price;
	int weigth;
	Color color;
	private double distance = 0;

	public Car(String modelName, int yearOfProd, int price, int weigth, Color string) {
		this.modelName = modelName;
		this.yearOfProd = yearOfProd;
		this.price = price;
		this.weigth = weigth;
		this.color = string;
	}
// Distance integer
	public void addDistance(int additionalDistance) {

		if (additionalDistance < 0) {
			additionalDistance = 0;
		}
		distance += additionalDistance;
	}
//Distance double 
	public void addDistance(double additionalDistance) {

		if (additionalDistance < 0) {
			additionalDistance = 0;
		}

		distance += additionalDistance;

	}

	public double getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Car [modelName = " + modelName + ", yearOfProd = " + yearOfProd + ", price = " + price + ", weigth = "
				+ weigth + ", color = " + color + ", distance = " + distance + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((color == null) ? 0 : color.hashCode());
//		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
//		result = prime * result + price;
//		result = prime * result + weigth;
//		result = prime * result + yearOfProd;
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color != other.color)
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (price != other.price)
			return false;
		if (weigth != other.weigth)
			return false;
		if (yearOfProd != other.yearOfProd)
			return false;
		return true;
	}

}

package ua.com.foxminded.carmanager;

public class Car {
	String modelName;
	int yearOfProd;
	int price;
	int weigth;
	Color color;

	public Car(String modelName, int yearOfProd, int price, int weigth, Color string) {
		this.modelName = modelName;
		this.yearOfProd = yearOfProd;
		this.price = price;
		this.weigth = weigth;
		this.color = string;
	}

	@Override
	public String toString() {
		return "Car [modelName = " + modelName + ", yearOfProd = " + yearOfProd + ", price = " + price + ", weigth = " + weigth
				+ ", color = " + color + "]";
	}

	
	
	
}

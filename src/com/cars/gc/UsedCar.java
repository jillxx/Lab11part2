package com.cars.gc;

public class UsedCar extends NewCar {
	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public UsedCar() {
		// TODO Auto-generated constructor stub
	}

	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return String.format("%1$-10s %2$-10s %3$-10d $%4$,10.2f (used)%5$,-10.2f miles", getMake(), getModel(), getYear(), getPrice(), mileage);
	}
	
	
}

package com.design.factoryMethod;

public  abstract class Create {

	//让子类决定生产什么产品
	public Car factoryMethod(String name){
		Car car = createCar(name);
		//go
		car.run("120");
		return car;
	}

	public abstract Car createCar(String name);
}

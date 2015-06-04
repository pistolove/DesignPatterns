package com.design.factoryMethod;

public class Test {
	public static void main(String[] args) {
	
		Create create = new CarCreate();
		Car car = create.factoryMethod("Biyadi");
		car.say();
	}
}

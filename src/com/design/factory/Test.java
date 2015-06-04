package com.design.factory;

public class Test {
	public static void main(String[] args) {
		Car c = Factory.getInstance("Benchi");
		c.run();
		c.start();
	}
}

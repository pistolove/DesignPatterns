package com.design.builder;

public class Test {

	public static void main(String[] args) {
		IBulider bulider = new ConcreateBuilder();
		Desinger desinger = new Desinger();
		desinger.order2design(bulider);
	}
}

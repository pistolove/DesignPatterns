package com.design.abstractFactory;

//����Ĺ���������Ʒ
public class ConcreateFactory1 extends Factory1 {

	@Override
	public IproductA getproductA1() {
		return new ProductA1();
	}

	@Override
	public IproductB getProductB1() {
		return new ProductB1();
	}

}

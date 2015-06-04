package com.design.builder;

//设计师知道房子怎么做，但是自己不会做，他指挥工人去做
public class Desinger {
	public void order2design(IBulider bulider){
		bulider.makeDoor();
		bulider.makeFloor();
		bulider.makeRoom();
		bulider.makeWindow();
	}
}

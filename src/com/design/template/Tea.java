package com.design.template;

public class Tea extends Template {

	@Override
	public void brew() {
		System.err.println("茶叶不用搅拌");
		
	}

	@Override
	public void addCondis() {
		System.err.println("茶叶不需要调料");
		
	}

	@Override
	public boolean customerwantsconditions() {
		return false;
	}

	
	
}

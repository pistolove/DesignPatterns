package com.design.template;

public class Tea extends Template {

	@Override
	public void brew() {
		System.err.println("��Ҷ���ý���");
		
	}

	@Override
	public void addCondis() {
		System.err.println("��Ҷ����Ҫ����");
		
	}

	@Override
	public boolean customerwantsconditions() {
		return false;
	}

	
	
}

package com.design.template;


public abstract class Template {

	void prepare() {
		boiwater();
		brew();
		pourIncup();

		if(customerwantsconditions())
		addCondis();
	}

	public boolean customerwantsconditions() {
		return true;
	}

	private void pourIncup() {
		System.err.println("���뱭��");
	}

	private void boiwater() {
		System.err.println("��ˮ");
	}

	public abstract void brew();

	public abstract void addCondis();

	
	
}

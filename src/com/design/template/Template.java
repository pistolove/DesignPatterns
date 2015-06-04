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
		System.err.println("µπ»Î±≠÷–");
	}

	private void boiwater() {
		System.err.println("…’ÀÆ");
	}

	public abstract void brew();

	public abstract void addCondis();

	
	
}

package com.design.template;

public class Coffer extends Template {

	@Override
	public void brew() {
		System.err.println("���迧��");
	}

	@Override
	public void addCondis() {
		System.err.println("���ȼ�����");
	}

	@Override
	public boolean customerwantsconditions() {
		String answer = "yes";
		if (answer.equals("yes")) {
			return true;
		}
		return false;
	}

}

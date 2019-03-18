package com.wjc.proxy;

public class Wjc implements People {

	private String height = "170";
	private String Sex = "男";
	
	@Override
	public String getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return Sex;
	}

	@Override
	public void getStandardsOfChoosingSpouse() {
		// TODO Auto-generated method stub
		System.out.println("性别男，爱好女");
		System.out.println("不想努力了，求富婆包养");
		
	}

	
	
}

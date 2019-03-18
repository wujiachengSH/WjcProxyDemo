package com.wjc.proxy;

public class Test {
	public static void main(String[] args) {

		try {
			People instance = (People) new MatchMaker().getInstance(new Wjc());
			instance.getStandardsOfChoosingSpouse();
			
			instance.getHeight();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

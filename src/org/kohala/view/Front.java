package org.kohala.view;

public class Front implements View { 
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf(":::::::::::::::%s:::%s:::::::::::::::::::::\n", appTitle, version);
		System.out.printf("::::::::::::::::::::::::::::::::::::::::by%s::::::::::::::\n",author);
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		
	}

}

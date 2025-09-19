package com.app.fruits;

 class Orange extends Friuts {

	public Orange(String name,String color,double weight) {
		super(name,weight,color);
	}

	@Override
	public String taste() {
		return ("Sour");
	}
	public void addOrange()
	{
		System.out.println("Enter Friuts");
	}

}

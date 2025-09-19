package com.app.fruits;

 class Mango extends Friuts {

	public Mango(String name,String color, Double weight) {
		
		super(name,weight,color);
	}

	@Override
	public String taste() {
		return("Sweet");
	}

}

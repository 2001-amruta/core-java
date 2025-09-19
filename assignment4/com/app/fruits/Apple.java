package com.app.fruits;

 class Apple extends Friuts
{
	public Apple(String name ,String color, double weight)
	{
		super(name, weight, color);
	}

	@Override
	 public String taste() {
		return ("sweet and sour");
	}

}

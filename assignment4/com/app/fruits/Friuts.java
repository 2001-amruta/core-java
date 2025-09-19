package com.app.fruits;

abstract  class Friuts {
	 protected String color;
	 protected double weight;
	 protected String name;
	 protected boolean isfresh;
	public Friuts(String color,double weight ,String name) 
	{
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.isfresh=true;
	}
	
	public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isfresh;
    }

    public void setFresh(boolean fresh) {
        isfresh = fresh;
    }

	public abstract String taste();
	
	@Override
	public String toString() {
		return "Friuts [color=" + color + ", weight=" + weight + ", name=" + name + ", isfresh=" + isfresh + "]";
	}

	

}

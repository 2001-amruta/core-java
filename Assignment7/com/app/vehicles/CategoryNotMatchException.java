package com.app.vehicles;

public class CategoryNotMatchException extends Exception{
	private String message;
	   public CategoryNotMatchException(String message) {
	        super(message);
	        this.message=message;
	    }

	    @Override
	    public String toString() {
	        return "CategoryNotMatchException: " + getMessage();
	    }
}

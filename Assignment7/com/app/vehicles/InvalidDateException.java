
package com.app.vehicles;

public class InvalidDateException extends Exception {
	private String message;
	
	 public InvalidDateException(String message) {
		super();
		this.message = message;
	}

	

	    @Override
	    public String toString() {
	        return "InvalidDateException: " + getMessage();
	    }
}

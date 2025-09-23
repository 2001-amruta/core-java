package sunbeam.com;

public class ExceptionLinetoolong extends Exception {
	private String invalidField;
	private int invalidValue;
	public ExceptionLinetoolong(String invalidField, int invalidValue) {
		this.invalidField = invalidField;
		this.invalidValue = invalidValue;
	}
	public String getInvalidField() {
		return invalidField;
	}
	public void setInvalidField(String invalidField) {
		this.invalidField = invalidField;
	}
	public int getInvalidValue() {
		return invalidValue;
	}
	public void setInvalidValue(int invalidValue) {
		this.invalidValue = invalidValue;
	}
	@Override
	public String getMessage() 
	{
        return String.format("The string '%s' exceeds the maximum allowed length of 80 characters. Length: %d", invalidField, invalidValue);
    }

	
}

	
	
	

	



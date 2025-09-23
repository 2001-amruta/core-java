package sunbeam.com;

public class Longstring {
 private String ch;
   public  Longstring(){
    	
    }
   public Longstring(String ch) {
		this.ch = ch;
	}
   public void setCh(String ch) throws ExceptionLinetoolong {
	   if(ch.length()>80)
	     throw new ExceptionLinetoolong (ch, ch.length());
		this.ch = ch;
	   
	   }
	public String getCh() {
		return ch;
	}
	@Override
	public String toString() {
        return "Longstring [ch=" + ch + "]";
    }
	
	

	

}

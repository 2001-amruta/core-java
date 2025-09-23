package sunbeam.comm;

class DiameterException extends Exception
{
    public DiameterException(String message)
    {
        super(message);
    }
}

public class Circle
{
    private double myX;
    private double myY;
    private double myDiameter;
    
    public Circle()
    {
        this.myX = 0;
        this.myY = 0;
        this.myDiameter = 100;
    }
    public Circle(double x, double y, double diameter) throws DiameterException
    {
        this.myX = x;
        this.myY = y;
        setMyDiameter(diameter);
    }
    public double getMyX()
    {
        return myX;
    }

    public void setMyX(double myX) 
    {
        this.myX = myX;
    }

    public double getMyY() 
    {
        return myY;
    }

    public void setMyY(double myY) 
    {
        this.myY = myY;
    }

    public double getMyDiameter() 
    {
        return myDiameter;
    }

    public void setMyDiameter(double myDiameter) throws DiameterException 
    {
        if (myDiameter < 0) 
        {
            throw new DiameterException("Diameter cannot be negative.");
        }
        this.myDiameter = myDiameter;
    }

    @Override
    public String toString() {
        return "Circle [Center=(" + myX + ", " + myY + "), Diameter=" + myDiameter + "]";
    }
}

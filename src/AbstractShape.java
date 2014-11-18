import TurtleGraphics.Pen;

abstract public class AbstractShape implements Shape{
    
    protected double xPos, yPos;
    
    public AbstractShape(){
        xPos=0;
        yPos=0;
    }
    public AbstractShape(double x, double y){
        xPos=x;
        yPos=y;
    }
    
    abstract public double area();
    abstract public double perimeter();
    abstract public void draw(Pen p);
    abstract public void stretchBy(double fact);
    
    public final double getXPos(){
        return xPos;
    }
    public final double getYPos(){
        return yPos;
    }
    public final void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos = yLoc;
    }
    public String toString(){
        String str = "X-Y Position: " + xPos + ", " + yPos;
        str += "\nArea: " + area();
        str += "\nPerimeter: " + perimeter();
        return str;
    }
    
}

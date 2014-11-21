import TurtleGraphics.Pen;

public class Wheel extends Circle{
    
    private int spokes;
    
    public Wheel(){
        super();
        spokes = 0;
    }
    
    public Wheel(double xLoc, double yLoc, double r, int s){
        super(xLoc,yLoc, r);
        spokes = s;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    
    public void stretchBy(double factor) {
        radius *= factor;
    }
    public void draw(Pen p){
        super.draw(p);
        for (int i = 1; i <= spokes; i++){
            p.up();
            p.move(xPos, yPos);
            p.setDirection(i * 360.0/spokes);
            p.down();
            p.move(radius);
        }
    }
    public void setSpokes(int s){
        spokes = s;
    }
    public String toString(){
        String str = "This is a Wheel\n";
        str += "Radius: " + radius;
        str += "\nArea: " + area();
        str += "\nPerimeter: " + perimeter();
        str += "\nSpokes: " + spokes;
        str += "\nX-Y Position: " + xPos + "," + yPos;
        return str;
    }

    
    
}

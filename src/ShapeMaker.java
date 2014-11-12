import TurtleGraphics.*;
import java.awt.Color;
import TerminalIO.*;
public class ShapeMaker {
    
    
    public static void main(String[] args) {
       Pen p = new StandardPen(new SketchPadWindow(400,400));
       Shape sl;
       double r, x, y;
       double w, h;
       int choice;
       KeyboardReader kr = new KeyboardReader();
       
       while(true){
           choice = kr.readInt("Enter 1 for Rectangle, 2 for Circle: ");
           if (choice == 1 || choice == 2)break;
       }
       if (choice == 1){
           w = kr.readDouble("Enter width of rectangle: ");
           h = kr.readDouble("Enter height of rectangle: ");
           sl = new Rect(0,0,w,h); 
       }
       else
       {
           r = kr.readDouble("Enter radius of Circle: ");
           sl = new Circle(0,0,r);
       }
       while(true){
           sl.draw(p);
           x = kr.readDouble("New x: ");
           y = kr.readDouble("New y: ");
           p.setColor(Color.white);
           sl.draw(p);
           sl.move(x,y);
           p.setColor(Color.blue);
           sl.draw(p);
       }
    }
    
}

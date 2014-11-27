public class FullTimeEmployee extends Employee{
    
    public FullTimeEmployee(){
        super();
        
    }
    public double getPay(){
        return rate * 40 + (hours-40)*(rate*2);
    }
    
}

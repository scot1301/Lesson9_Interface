public class FullTimeEmployee extends Employee{
    
    public FullTimeEmployee(){
        super();
        
    }
    public double getPay(){
        return rate * 60 + (hours-60)*(rate*2);
    }
    
}

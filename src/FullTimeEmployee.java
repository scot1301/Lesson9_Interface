public class FullTimeEmployee extends Employee{
    
    public FullTimeEmployee(){
        super();
        
    }
    public double getPay(){
        totalpay += rate * 60 + (hours-60)*(rate*2);
        return rate * 60 + (hours-60)*(rate*2);
    }
    
}

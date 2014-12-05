public class PartTimeEmployee extends Employee{
    
    public PartTimeEmployee(){
        super();
       
    }
    public double getPay(){
        totalpay += rate * hours;
        return rate * hours;
    }
}

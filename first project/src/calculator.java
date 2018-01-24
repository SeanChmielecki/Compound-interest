
public class calculator {
	public static void main(String[] args) {
	       
        double principle=5000.0;//intial amount before interest
        double rate=.05;//interes rate
        
        //display headers
        System.out.printf("%s%20s%n", "year","amount on deposit");
        //calculate amount on deposit for each of ten years
        for(int year=1;year<=120;++year)
        {
            //caluclate new amount on deposit for specified year
            double amount=principle*Math.pow(1.0+rate,year);
            
            //display the year and amount
            System.out.printf("%4d%,20.2f%n", year,amount);
        }
    }
    
}

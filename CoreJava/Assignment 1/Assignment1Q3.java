
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate)
    {
    	double sInterest = (principalAmount*time*interestRate)/100;
    	return sInterest;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate)
    {
    	double rate = interestRate/100;
    	double cInterest = principalAmount * (Math.pow((1 + rate), time)) - principalAmount;
    	return cInterest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) 
    {	
    	SiCi sc = new SiCi();
    	double SI = sc.simpleInterest(5000, 5, 10);
    	System.out.println("Simple Interest : "+SI);
    	double CI = sc.compoundInterest(5000, 5, 10);
    	System.out.println("Compound Interest : "+CI);
    }
}













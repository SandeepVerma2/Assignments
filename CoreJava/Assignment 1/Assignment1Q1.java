class ArmstrongOrNot {
   	public boolean armstrongCheck(int num) 
    
    {
    	int sum=0;
		int temp=num;
    	while(num>0)
		{
			int i = num%10;
			sum = sum +(i*i*i);
			num = num/10;
		}
    	 if(temp==sum)  
		    return true;
    	 else
    		 return false;
    }
    }

public class Assignment1Q1 {
    public static void main(String[] args) 
    {
    	ArmstrongOrNot a = new ArmstrongOrNot();
    	
    	System.out.println(a.armstrongCheck(456));
    	
    }
}




class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	 if(ctc < 180000) 
    		 return 0;
         else if(ctc <= 300000 && ctc >= 180001) 
        	 return (ctc * 10)/100;
         else if(ctc <= 500000 && ctc >= 300001) 
        	 return (ctc * 20)/100;
         else if(ctc < 1000000 && ctc >= 500001) 
        	 return (ctc * 30)/100;
         else 
         return 0;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	TaxAmount t = new TaxAmount();
    	System.out.println(t.calculateTaxAmount(500000));
    }
}


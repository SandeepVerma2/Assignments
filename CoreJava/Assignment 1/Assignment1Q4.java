class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) 
    {
    	if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60)
    		return "Passed";
    	else if((subject1Marks>60 && subject2Marks>60) || (subject2Marks>60 && subject3Marks>60) || (subject3Marks>60 && subject1Marks>60))
    		return "Promoted";
    	else if(subject1Marks<60 || subject2Marks<60 || subject3Marks<60) 
    		return "Failed"; 
    	else
    		return "0";
    
    }
}
public class Assignment1Q4 {
    public static void main(String[] args)
    {
    	ResultDeclaration r = new ResultDeclaration();
    	System.out.println(r.declareResults(70,80,70));
    }
}


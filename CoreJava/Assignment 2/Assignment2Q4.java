abstract class EmptyClass{

}

abstract class AbstractClass{
    void show()
    {
        System.out.print("abstract class method called");
    }
}

public class Assignment2Q4 extends AbstractClass{

    @Override
    void show()
    {
        System.out.println("derived class function called");
    }

    public static void main(String srgs[]){ 
    	
        Assignment2Q4 obj = new Assignment2Q4(); 
        
        obj.show();

    }
}
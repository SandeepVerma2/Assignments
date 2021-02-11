 import java.util.*;
import java.util.function.Consumer;

public class Assignment4Q8 implements Runnable{
	public static void main(String[] Args) {
		Assignment4Q8 assign = new Assignment4Q8();  
        Thread t1= new Thread(assign);  
        t1.start();   
        
        List<String> list = new ArrayList<>();
        list.add("Eng");
        list.add("Delhi");
        list.add("Mumbai");
        
        assign.print.accept(list);
	}
	
	Consumer<List<String>> print = list -> {
		for (String s : list) {
			 System.out.println(s); 
		}
	};

	@Override
	public void run() {
	}
}
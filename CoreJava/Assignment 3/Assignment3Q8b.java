import java.util.concurrent.CopyOnWriteArrayList; 
import java.util.Iterator; 
  
class Assignment3Q8b { 
    public static void main(String args[]) 
    { 
        CopyOnWriteArrayList<Integer> list 
            = new CopyOnWriteArrayList<Integer>(new Integer[] { 5,9,8,7 }); 
        Iterator itr = list.iterator(); 
        while (itr.hasNext()) { 
            Integer no = (Integer)itr.next(); 
            System.out.println(no); 
            if (no == 5) 
            	list.add(14); 
        } 
    } 
} 
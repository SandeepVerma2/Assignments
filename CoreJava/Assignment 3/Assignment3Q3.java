import java.util.*;
public class Assignment3Q3 {
    public static List traverseReverse(ArrayList aList){
        int size = aList.size();
        ArrayList<Object> list = new ArrayList<Object>(size);
        ListIterator rev = aList.listIterator();
        for(int i=0,j=size-1 ; j >=0 ; i++,j--){
            list.add(i, aList.get(j));
        }
        return list;

    }
    public static void main(String[] args) {}
}

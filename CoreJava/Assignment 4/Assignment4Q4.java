import java.util.ArrayList;

class Assignment4Q4
{
    public static void removeOddLength(ArrayList <String> stringList){
        for(int i=0;i<stringList.size();i++){
            String word=stringList.get(i);
            if(word.length()%2!=0){
                stringList.remove(word);
                i = i-1;
                continue;
            }
        }

        for(int i=0;i<stringList.size();i++){
            String word=stringList.get(i);
            System.out.println(word);
        }
    }

public static void main(String []args)
{
    ArrayList <String> stringList = new ArrayList <String>();
    stringList.add("NewDelhi");
    stringList.add("Mumbai");
    stringList.add("Goa");
    removeOddLength(stringList);
}
}
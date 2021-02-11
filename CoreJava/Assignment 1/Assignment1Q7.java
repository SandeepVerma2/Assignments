class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
        int size = 10;
        boolean ans = false;
        for(int i=0, j=size-1;i!=j;++i,--j){
            if(arr[i] == toCheckValue || arr[j] == toCheckValue) ans = true;
        }
        return ans;
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = {12,50,45,65,25,45,51,54,5,89};
        int valueToCheck = 5;
    }
}
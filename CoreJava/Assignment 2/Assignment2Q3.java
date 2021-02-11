import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() { return totalDeposits+creditLimit; }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 1000;
    @Override
    public int getCash() { return totalDeposits+fixedDepositAmount;}
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        int total=0;
        int size = cash.size();
        for(int i=0;i<size;i++)
        {
            total+=cash.get(i);
        }
        return total;
    }
    public int getCash(){ return 0; }
    public static void main(String[] args) {}
}
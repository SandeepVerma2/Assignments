import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int total=0;
        int size = employeeSalaries.size();
        for(int i=0;i<size;++i){
            total+=employeeSalaries.get(i);
        }
        return total;
    }
    public static void main(String[] args) {}
}
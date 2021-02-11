interface Operation{
    public double operation();
}

public class Assignment4Q1 {
    public double addition(int num1,int num2){
        Operation operation = () -> Double.parseDouble(String.valueOf((num1 + num2)));
        return operation.operation();
    }
    public double subtraction(int num1,int num2){
        Operation operation = () -> Double.parseDouble(String.valueOf((num1 - num2)));
        return operation.operation();
    }
    public double multiplication(int num1,int num2){
        Operation operation = () -> (num1 * num2);
        return operation.operation();
    }
    public double division(int num1,int num2){
        Operation operation = () -> Double.parseDouble(String.valueOf((num1 / num2)));
        return operation.operation();
    }
    public static void main(String[] args) {}
}
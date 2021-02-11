import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost(int dessert);
}
class Candy extends DesertItem {
    private int candies=0;
    public int addCandies(int candies){
        return this.candies+=candies;
    }
    @Override
    public int getCost(int candies){
        return candies * 60;
    }
}
class Cookie extends DesertItem {
    private int cookies=0;
    public int addCookies(int cookies){
        return this.cookies += cookies;
    }
    @Override
    public int getCost(int cookies){
        return cookies * 70;
    }

}
class IceCream extends DesertItem {
    private int iceCream=0;
    public int addIceCreams(int iceCream){
        return this.iceCream += iceCream;
    }
    @Override
    public int getCost(int iceCream){
        return iceCream * 10;
    }
}
public class Assignment2Q7 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Assignment2Q7 obj = new Assignment2Q7();
        obj.selectRoles();
    }
    private void selectRoles(){
        System.out.println("Enter role : ");
        String role = sc.nextLine();
        roles(role);
    }
    private void roles(String role){
        if(role.toLowerCase() == "owner"){
            addItems();

        }
        else if (role.toLowerCase() == "customer"){
            placeOrder();
        }
    }
    private void addItems() {
        System.out.println("Select from below to add items : \n 1. Candy\n 2. Cookie\n Ice Cream");
        int choice = sc.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        addItemsOperation(choice, quantity);
    }
    private void addItemsOperation(int choice, int quantity) {
        switch (choice) {
            case 1 -> {
                Candy candy = new Candy();
                int dessert = candy.addCandies(quantity);
                System.out.println("Total candies updated to: " + dessert);
            }
            case 2 -> {
                Cookie cookie = new Cookie();
                int dessert = cookie.addCookies(quantity);
                System.out.println("Total cookies updated to: " + dessert);
            }
            case 3 -> {
                IceCream iceCream = new IceCream();
                int dessert = iceCream.addIceCreams(quantity);
                System.out.println("Total ice creams updated to: " + dessert);
            }
        }
        System.out.println("Want to add more items? Y/N");
        String ans = sc.nextLine();
        if(ans.toUpperCase().equals("Y")) addItems();
        else selectRoles();
    }
    private void placeOrder() {
        System.out.println("Select from below to add items : \n 1. Candy\n 2. Cookie\n Ice Cream");
        int choice = sc.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        placeOrderOperation(choice, quantity);
    }

    private void placeOrderOperation(int choice, int quantity) {
        int total=0;
        switch (choice){
            case 1 -> {
                Candy candy = new Candy();
                total += candy.getCost(quantity);
            }
            case 2 -> {
                Cookie cookie = new Cookie();
                total += cookie.getCost(quantity);
            }
            case 3 -> {
                IceCream iceCream = new IceCream();
                total += iceCream.getCost(quantity);
            }
        }
        System.out.println("Total cost : " + total + "\nDo you want to add something else? Y/N");
        String op = sc.nextLine();
        if(op.toLowerCase().equals("y")) placeOrder();
        else selectRoles();
    }
}
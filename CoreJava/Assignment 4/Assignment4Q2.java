import java.util.ArrayList;
import java.util.function.Function;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    public Assignment4Q2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Assignment4Q2{" +
                "totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                '}';
    }

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
        ArrayList<Assignment4Q2> ans = new ArrayList<>();
        Function function = (order) -> {
            for(Assignment4Q2 o : orders){
                if(o.totalPrice > 10000 && (o.status.toUpperCase().equals("ACCEPTED")|| o.status.toUpperCase().equals("COMPLETED")))
                    ans.add(o);
            }
            return ans;
        };
        function.apply(orders);
        return ans;
    }
    public static void main(String[] args) {
        Assignment4Q2 obj1 = new Assignment4Q2(10300, "COMPLETED");
        Assignment4Q2 obj2 = new Assignment4Q2(11000, "ACCEPTED");
        Assignment4Q2 obj3 = new Assignment4Q2(10000, "FAILED");
        Assignment4Q2 obj4 = new Assignment4Q2(11000, "COMPLETED");
        Assignment4Q2 obj5 = new Assignment4Q2(1000, "COMPLETED");

        ArrayList<Assignment4Q2> aList = new ArrayList<>();
        aList.add(obj1);
        aList.add(obj2);
        aList.add(obj3);
        aList.add(obj4);
        aList.add(obj5);

        System.out.println(listOfOrders(aList));

    }
}
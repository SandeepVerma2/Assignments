import java.util.HashMap;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

public class Assignment3Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Employee> map = new HashMap<>();
        System.out.println(map.put(1, new Employee("Sandeep", 201)));
        map.put(2, new Employee("Suresh", 301));
        System.out.println(map.get(2));
    }
}
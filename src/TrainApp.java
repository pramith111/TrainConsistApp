import java.util.LinkedList;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== UC4: Ordered Train Consist ===");
        LinkedList<String> consist = new LinkedList<>();
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");
        System.out.println("Initial: " + consist);
        consist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car: " + consist);
        consist.removeFirst();
        consist.removeLast();
        System.out.println("After removing first & last: " + consist);
    }
}
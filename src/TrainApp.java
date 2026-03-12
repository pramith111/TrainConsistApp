import java.util.ArrayList;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== UC2: Passenger Bogies ===");
        ArrayList<String> bogies = new ArrayList<>();
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");
        System.out.println("After Adding: " + bogies);
        bogies.remove("AC Chair");
        System.out.println("After Removing AC Chair: " + bogies);
        System.out.println("Contains Sleeper? " + bogies.contains("Sleeper"));
    }
}
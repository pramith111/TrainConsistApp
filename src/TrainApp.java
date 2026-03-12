import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== UC10: Total Seating Capacity ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 18, "Passenger"));

        // Sum all capacities
        int total = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + total + " seats");
    }
}
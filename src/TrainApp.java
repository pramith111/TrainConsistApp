import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== UC13: Performance Comparison ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 18, "Passenger"));

        // Loop-based filtering
        long loopStart = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 50) {
                loopResult.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        System.out.println("Loop Time: " + (loopEnd - loopStart) + " ns");

        // Stream-based filtering
        long streamStart = System.nanoTime();
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        System.out.println("Stream Time: " + (streamEnd - streamStart) + " ns");
    }
}
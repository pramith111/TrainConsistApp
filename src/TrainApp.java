import java.util.HashMap;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== UC6: Bogie Capacity Map ===");
        HashMap<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 64);
        capacityMap.put("First Class", 18);
        for (var entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " seats");
        }
    }
}
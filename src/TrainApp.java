import java.util.HashSet;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== UC3: Unique Bogie IDs ===");
        HashSet<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // duplicate
        System.out.println("Bogie IDs: " + bogieIds);
    }
}
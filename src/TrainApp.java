import java.util.LinkedHashSet;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== UC5: Insertion Order + Unique ===");
        LinkedHashSet<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate - ignored
        System.out.println("Train Formation: " + formation);
    }
}
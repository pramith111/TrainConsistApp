import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Compliance Check ===");

        List<Bogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new Bogie("Cylindrical", "Goods", "Petroleum")); // safe
        goodsBogies.add(new Bogie("Rectangular", "Goods", "Coal"));      // safe
        goodsBogies.add(new Bogie("Cylindrical", "Goods", "Coal"));      // unsafe!

        // Safety rule: Cylindrical → only Petroleum allowed
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.name.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true;
                });

        System.out.println("Train Safety Compliant: " + isSafe);

        if (!isSafe) {
            System.out.println("Warning: Unsafe cargo detected!");
        }
    }
}
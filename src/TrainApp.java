import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== UC11: Validate Train ID & Cargo Code ===");

        // Patterns
        String trainIdPattern = "TRN-\\d{4}";
        String cargoPattern   = "PET-[A-Z]{2}";

        // Test inputs
        String trainId1 = "TRN-1234";  // valid
        String trainId2 = "TRAIN12";   // invalid
        String cargo1   = "PET-AB";    // valid
        String cargo2   = "pet-ab";    // invalid

        // Validate
        System.out.println(trainId1 + " → " + (trainId1.matches(trainIdPattern) ? "Valid" : "Invalid"));
        System.out.println(trainId2 + " → " + (trainId2.matches(trainIdPattern) ? "Valid" : "Invalid"));
        System.out.println(cargo1   + " → " + (cargo1.matches(cargoPattern)     ? "Valid" : "Invalid"));
        System.out.println(cargo2   + " → " + (cargo2.matches(cargoPattern)     ? "Valid" : "Invalid"));
    }
}
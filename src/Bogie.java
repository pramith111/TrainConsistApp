public class Bogie {
    String name;
    int capacity;
    String type;   // "Passenger" or "Goods"
    String cargo;  // for goods bogies

    // Constructor for Passenger bogies
    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    // Constructor for Goods bogies
    public Bogie(String name, String type, String cargo) {
        this.name = name;
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}
import java.util.ArrayList;

public class Animal {

    // ===== Instance Variables =====
    private String animalType;

    // ===== Static Variables =====
    private static int animalCount = 0;

    // Optional: a fixed menu of animal types to choose from
    private static final String[] TYPES = {
        "Lion", "Bear", "Elephant", "Giraffe", "Zebra", "Penguin", "Snake", "Monkey"
    };

    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: choose a random animal type
     * REQUIRED: increment animalCount
     */
    public Animal() {
        // TODO: set animalType to a random type from TYPES
        // TODO: increment animalCount
        this.animalType = TYPES[(int) (Math.random()*TYPES.length)];
        animalCount++;
    }

    /**
     * Parameterized constructor:
     * REQUIRED: set animalType to type
     * REQUIRED: increment animalCount
     */
    public Animal(String type) {
        // TODO: set animalType
        // TODO: increment animalCount
        this.animalType = type;
        animalCount++;
    }

    // ===== Getters / Setters =====

    public String getAnimalType() {
        return animalType;
    }

    // ===== Class-level getter =====
    public static int getAnimalCount() {
        return animalCount;
    }

    // ===== Behaviors =====

    /**
     * REQUIRED: returns a sound based on animalType.
     * You may choose your own sounds; keep it consistent.
     */
    public String speak() {
        // TODO: return a sound depending on animalType
        // Example idea:
        // if (animalType.equals("Lion")) return "Roar!";
        if (animalType.equals("Lion")) { return "Roar!"; }
        else if (animalType.equals("Bear")) { return "GROWL!"; }
        else if (animalType.equals("Elephant")) { return "STOMP."; }
        else if (animalType.equals("Giraffe")) { return "Chew"; }
        else if (animalType.equals("Zebra")) { return "Neigh!"; }
        else if (animalType.equals("Penguin")) { return "Nub nub!"; }
        return "";
    }

    /**
     * OPTIONAL helper: return a random animal type from TYPES.
     */
    private static String randomAnimalType() {
      return TYPES[(int)(Math.random()*TYPES.length)];
    }

    public String toString() {
        return "";
    }
}
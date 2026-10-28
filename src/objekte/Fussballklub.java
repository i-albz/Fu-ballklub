package objekte;

// Represents a football club in Germany that has a team[cite: 1]
public class Fussballklub {
    private String name;
    private Mannschaft mannschaft;

    public Fussballklub(String name, Mannschaft mannschaft) {
        this.name = name;
        this.mannschaft = mannschaft;
    }

    public String getName() { return name; }
    public Mannschaft getMannschaft() { return mannschaft; }

    public void printKlubInfo() {
        System.out.println("=== Fußballklub: " + name + " ===");
        System.out.println("Cheftrainer: " + mannschaft.getCheftrainer());
        System.out.println("\nTrainerteam:");
        for (Trainer t : mannschaft.getTrainerteam()) {
            System.out.println("  - " + t);
        }
        System.out.println("\nSpielerkader:");
        for (Spieler s : mannschaft.getSpielerkader()) {
            String kapitaenInfo = (s.equals(mannschaft.getKapitaen())) ? " (Kapitän)" : "";
            System.out.println("  - " + s + kapitaenInfo);
        }
    }
}
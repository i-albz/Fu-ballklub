package objekte;

import java.util.ArrayList;
import java.util.List;

// Consists of the squad, head coach, coaching team, and captain[cite: 1]
public class Mannschaft {
    private Trainer cheftrainer;
    private List<Trainer> trainerteam;
    private List<Spieler> spielerkader;
    private Spieler kapitaen;

    public Mannschaft(Trainer cheftrainer) {
        this.cheftrainer = cheftrainer;
        this.trainerteam = new ArrayList<>();
        this.spielerkader = new ArrayList<>();
    }

    public void addTrainerZumTeam(Trainer trainer) {
        this.trainerteam.add(trainer);
    }

    public void addSpieler(Spieler spieler) {
        // Real-life practice: Prevent duplicate jersey numbers in the same squad[cite: 1]
        for (Spieler s : spielerkader) {
            if (s.getTrikotNummer() == spieler.getTrikotNummer()) {
                throw new IllegalArgumentException(
                    "Trikotnummer " + spieler.getTrikotNummer() + " ist bereits vergeben!"
                );
            }
        }
        this.spielerkader.add(spieler);
    }

    public void setKapitaen(Spieler kapitaen) {
        if (!spielerkader.contains(kapitaen)) {
            throw new IllegalArgumentException("Der Kapitän muss Teil des Spielerkaders sein!");
        }
        this.kapitaen = kapitaen;
    }

    public Trainer getCheftrainer() { return cheftrainer; }
    public List<Trainer> getTrainerteam() { return trainerteam; }
    public List<Spieler> getSpielerkader() { return spielerkader; }
    public Spieler getKapitaen() { return kapitaen; }
}
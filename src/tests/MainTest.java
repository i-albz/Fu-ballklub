package tests;

import java.time.LocalDate;

import objekte.Fussballklub;
import objekte.Mannschaft;
import objekte.Spieler;
import objekte.SpielerRolle;
import objekte.Trainer;
import objekte.TrainerBereich;

public class MainTest {
    public static void main(String[] args) {
        // 1. Instantiate Head Coach and Coaching Team (Class = Trainer, Instances = chef, coOffensive, etc.)[cite: 1, 2]
        Trainer chef = new Trainer("Vincent Kompany", LocalDate.of(1986, 4, 10), TrainerBereich.CHEFTRAINER);
        Trainer coOffensive = new Trainer("Max Mustermann", LocalDate.of(1980, 5, 12), TrainerBereich.OFFENSIVE);
        Trainer coDefensive = new Trainer("Erik Meijer", LocalDate.of(1975, 8, 2), TrainerBereich.DEFENSIVE);
        Trainer coTorwart = new Trainer("Michael Rechner", LocalDate.of(1980, 5, 27), TrainerBereich.TORWART);
        Trainer coFitness = new Trainer("Holger Broich", LocalDate.of(1974, 9, 18), TrainerBereich.FITNESS);

        // 2. Instantiate Team and add coaching staff[cite: 1, 2]
        Mannschaft mannschaft = new Mannschaft(chef);
        mannschaft.addTrainerZumTeam(coOffensive);
        mannschaft.addTrainerZumTeam(coDefensive);
        mannschaft.addTrainerZumTeam(coTorwart);
        mannschaft.addTrainerZumTeam(coFitness);

        // 3. Instantiate Players (Class = Spieler, Instances = s1, s2, s3)[cite: 1, 2]
        Spieler s1 = new Spieler("Manuel Neuer", LocalDate.of(1986, 3, 27), 1, SpielerRolle.TORWART);
        Spieler s2 = new Spieler("Dayot Upamecano", LocalDate.of(1998, 10, 27), 2, SpielerRolle.DEFENSIVSPIELER);
        Spieler s3 = new Spieler("Jamal Musiala", LocalDate.of(2003, 2, 26), 42, SpielerRolle.OFFENSIVSPIELER);

        mannschaft.addSpieler(s1);
        mannschaft.addSpieler(s2);
        mannschaft.addSpieler(s3);

        // 4. Assign Team Captain[cite: 1]
        mannschaft.setKapitaen(s1);

        // 5. Instantiate Football Club and print verification[cite: 1, 2]
        Fussballklub klub = new Fussballklub("FC Bayern München", mannschaft);
        klub.printKlubInfo();
    }
}
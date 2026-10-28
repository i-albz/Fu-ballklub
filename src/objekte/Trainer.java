package objekte;

import java.time.LocalDate;

// Represents the head coach or a member of the specialized coaching team[cite: 1]
public class Trainer extends Person {
    private TrainerBereich bereich;

    public Trainer(String name, LocalDate geburtsdatum, TrainerBereich bereich) {
        super(name, geburtsdatum);
        this.bereich = bereich;
    }

    public TrainerBereich getBereich() {
        return bereich;
    }

    public void setBereich(TrainerBereich bereich) {
        this.bereich = bereich;
    }

    @Override
    public String toString() {
        return super.toString() + " - Bereich: " + bereich;
    }
}
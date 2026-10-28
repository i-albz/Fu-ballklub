package objekte;

import java.time.LocalDate;

// Holds self-selected personal data like name and birth date[cite: 1]
public abstract class Person {
    private String name;
    private LocalDate geburtsdatum;

    public Person(String name, LocalDate geburtsdatum) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
    }

    public String getName() {
        return name;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    @Override
    public String toString() {
        return name + " (*" + geburtsdatum + ")";
    }
}
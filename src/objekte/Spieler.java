package objekte;

import java.time.LocalDate;

// Represents a player with a jersey number and assigned role[cite: 1]
public class Spieler extends Person {
    private int trikotNummer;
    private SpielerRolle rolle;

    public Spieler(String name, LocalDate geburtsdatum, int trikotNummer, SpielerRolle rolle) {
        super(name, geburtsdatum);
        this.trikotNummer = trikotNummer;
        this.rolle = rolle;
    }

    public int getTrikotNummer() {
        return trikotNummer;
    }

    public void setTrikotNummer(int trikotNummer) {
        this.trikotNummer = trikotNummer;
    }

    public SpielerRolle getRolle() {
        return rolle;
    }

    public void setRolle(SpielerRolle rolle) {
        this.rolle = rolle;
    }

    @Override
    public String toString() {
        return "#" + trikotNummer + " " + super.toString() + " [" + rolle + "]";
    }
}
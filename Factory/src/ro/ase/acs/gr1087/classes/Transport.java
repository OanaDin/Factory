package ro.ase.acs.gr1087.classes;

public abstract class Transport {
    public String nume;
    public int capacitate;
    public int vitezaMax;

    public Transport(String nume, int capacitate, int vitezaMax) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.vitezaMax = vitezaMax;
    }

    public abstract String infoSuplimentare();
}


package ro.ase.acs.gr1087.classes;

public class Tramvai extends Transport {
    int linie;
    public Tramvai(String nume, int capacitate, int vitezaMax, int linie) {
        super(nume, capacitate, vitezaMax);
        this.linie = linie;
    }

    @Override
    public String infoSuplimentare() {
        return "Numar linie: "+ linie;
    }
}

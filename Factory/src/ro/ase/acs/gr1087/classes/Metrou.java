package ro.ase.acs.gr1087.classes;

public class Metrou extends Transport{
    String culoareLinie;
    public Metrou(String nume, int capacitate, int vitezaMax, String culoareLinie) {
        super(nume, capacitate, vitezaMax);
        this.culoareLinie = culoareLinie;
    }

    @Override
    public String infoSuplimentare() {
        return "Culoare Linie: "+culoareLinie;
    }
}

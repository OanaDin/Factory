package ro.ase.acs.gr1087.classes;

public class Autobuz extends Transport{
    int nrRuta;

    public Autobuz(String nume, int capacitate, int vitezaMax, int nrRuta) {
        super(nume, capacitate, vitezaMax);
        this.nrRuta = nrRuta;
    }

    @Override
    public String infoSuplimentare() {
        return "Numar ruta: " + nrRuta;
    }
}

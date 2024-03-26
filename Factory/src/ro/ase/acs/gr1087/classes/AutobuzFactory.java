package ro.ase.acs.gr1087.classes;

public class AutobuzFactory extends TransportFactory {



    @Override
    public Transport creareTransport(String nume, int capacitate, int vitezaMax) {
        return new Autobuz(nume, capacitate, vitezaMax, 12);
    }
}

package ro.ase.acs.gr1087.classes;

public class TramvaiFactory extends TransportFactory{

    @Override
    public Transport creareTransport(String nume, int capacitate, int vitezaMax) {
        return new Tramvai(nume, capacitate, vitezaMax, 11);
    }
}

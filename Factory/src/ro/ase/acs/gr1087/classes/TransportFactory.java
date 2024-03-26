package ro.ase.acs.gr1087.classes;

public abstract class TransportFactory {
    public abstract Transport creareTransport(String nume, int capacitate, int vitezaMax);
}

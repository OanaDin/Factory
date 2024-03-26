package ro.ase.acs.gr1087.classes;

public class MetrouFactory extends TransportFactory{

    @Override
    public Transport creareTransport(String nume, int capacitate, int vitezaMax) {
        return new Metrou(nume, capacitate,vitezaMax,"verde");
    }
}

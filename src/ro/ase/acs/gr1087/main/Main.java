package ro.ase.acs.gr1087.main;

import ro.ase.acs.gr1087.classes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TransportFactory[] factories ={ new AutobuzFactory(), new TramvaiFactory(), new MetrouFactory()};
       // for(TransportFactory factory : factories) {

        TransportFactory factory = factories[0];
            Transport transport = factory.creareTransport("Autobuz", 23,22);
            Transport transport2 = factory.creareTransport("metrou", 212,60);

            Transport transport3 = factory.creareTransport("tramvai", 63,30);

            System.out.println("Nume: "+ transport.nume+ ", Capacitate: " + transport.capacitate + ", vitezaMax: "+ transport.vitezaMax+ ", "+ transport.infoSuplimentare());
            System.out.println("Nume: "+ transport2.nume+ ", Capacitate: " + transport2.capacitate + ", vitezaMax: "+ transport2.vitezaMax+ ", "+ transport2.infoSuplimentare());
            System.out.println("Nume: "+ transport3.nume+ ", Capacitate: " + transport3.capacitate + ", vitezaMax: "+ transport3.vitezaMax+ ", "+ transport3.infoSuplimentare());


   // }

    }
}

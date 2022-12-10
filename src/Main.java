import abstractizare.Cantec1;
import abstractizare.Ciocnire;
import polimorfism.Anotimp;
import polimorfism.Vara;

public class Main {
    public static void main(String[] args) {
        Anotimp toamna = new Anotimp(4);
        toamna.descriere();
        Anotimp vara = new Vara(136);
        vara.descriere();
        Vara vara1 = new Vara(136);
        vara1.descriere();
        vara1.start(4);
        vara1.interval();

        Cantec1 lastChristmas = new Cantec1("pop",1999,3);
        lastChristmas.startCantec();
        System.out.println("Cantecul se difuzeaza");
        lastChristmas.stopCantec();
        System.out.println("Cantecul a fost oprit");

        Ciocnire corp = new Ciocnire();
        System.out.println(corp.plastica(10,5,10,15));
        System.out.println(corp.elastica(2,7,10,5));
    }
}
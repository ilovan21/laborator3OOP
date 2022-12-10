package abstractizare;

public class Cantec1 extends Cantec{

    public Cantec1(String gen, int anAparitie, int durata){
        super(gen, anAparitie, durata);
    }

    @Override
    public void startCantec() {
        setPopular(false);
    }

    @Override
    public void stopCantec() {
        setPopular(true);
    }
}
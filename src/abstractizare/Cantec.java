package abstractizare;

public abstract class Cantec {
    private String gen;
    private int anAparitie;
    private int durata;
    private boolean popular = false;

    public Cantec(String gen, int anAparitie, int durata) {
        this.gen = gen;
        this.anAparitie = anAparitie;
        this.durata = durata;
    }

    public abstract void startCantec();
    public abstract void stopCantec();


    public String getGen() {
        return gen;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public int getDurata() {
        return durata;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }
}
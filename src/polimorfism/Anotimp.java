package polimorfism;

public class Anotimp {
    private int nrOrdine;
    private int tempMax;
    private int tempMin;
    private int durata;

    public Anotimp(int nrOrdine){
        this.nrOrdine = nrOrdine;
    }

    public Anotimp(int tempMin, int tempMax){
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public void descriere(){
        System.out.println("Acest anotimp este una din cele 4 diviziuni ale anului");
    }

    public void interval(){
        System.out.println("Acest anotimp dureaza 3 luni");
    }

    public int getDurata() {
        return durata;
    }

    public int getTempMax() {
        return tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }
}
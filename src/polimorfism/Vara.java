package polimorfism;

public class Vara extends Anotimp{

    public Vara(int durata){
        super(16,durata);
    }

    @Override
    public void descriere(){
        System.out.println("Vara este cel mai cald anotimp");
    }

    public void start(int n){
        if (n<10) {
            System.out.println("19.05");
        }
        else{
            System.out.println("21.05");
        }
    }
}
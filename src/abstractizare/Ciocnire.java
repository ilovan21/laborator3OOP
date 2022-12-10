package abstractizare;
public class Ciocnire implements TipCiocnire{
    @Override
    public int plastica(int m1, int m2,int v1, int v2) {
        return ((m1-m2)*v1+2*(m2*v2))/(m1+m2);
    }

    @Override
    public int elastica(int m1, int m2,int v1, int v2) {
        return ((m2-m1)*v1+2*(m1*v1))/(m1+m2);
    }
}
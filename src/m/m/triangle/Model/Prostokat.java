package m.m.triangle.Model;

public class Prostokat extends Czworokat{
    public Prostokat(int bokA, int bokB, int bokC, int bokD, int obwod, int polePowierzchni) {
        super(bokA, bokB, bokC, bokD, obwod, polePowierzchni);
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                ", bokD=" + bokD +
                ", obwod=" + obwod +
                ", polePowierzchni=" + polePowierzchni +
                '}';
    }
}

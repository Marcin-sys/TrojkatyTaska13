package m.m.triangle.Model;

public class Prostokat extends Czworokat {
    public Prostokat(int bokA, int bokB, int bokC, int bokD) {
        super(bokA, bokB, bokC, bokD);
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

package m.m.triangle.Model;

public class Kwadrat extends Czworokat {
    public Kwadrat(int bokA, int bokB, int bokC, int bokD) {
        super(bokA, bokB, bokC, bokD);
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                ", bokD=" + bokD +
                ", obwod=" + obwod +
                ", polePowierzchni=" + polePowierzchni +
                '}';
    }
}

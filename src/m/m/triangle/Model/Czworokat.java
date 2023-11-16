package m.m.triangle.Model;

public class Czworokat extends FiguryGeometryczne {

    int bokD;


    public Czworokat(int bokA, int bokB, int bokC, int bokD) {
        super(bokA, bokB, bokC);
        this.bokD = bokD;
    }

    @Override
    public String toString() {
        return "Czworokat{" +
                "bokD=" + bokD +
                ", bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                ", obwod=" + obwod +
                ", polePowierzchni=" + polePowierzchni +
                '}';
    }

    public int getBokD() {
        return bokD;
    }

    public void setBokD(int bokD) {
        this.bokD = bokD;
    }
}

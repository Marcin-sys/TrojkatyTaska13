package m.m.triangle.Model;

public class Pieciokat extends FiguryGeometryczne {

    int bokD;
    int bokE;


    public Pieciokat(int bokA, int bokB, int bokC, int obwod, int polePowierzchni, int bokD, int bokE) {
        super(bokA, bokB, bokC, obwod, polePowierzchni);
        this.bokD = bokD;
        this.bokE = bokE;
    }

    @Override
    public String toString() {
        return "Pieciokat{" +
                "bokD=" + bokD +
                ", bokE=" + bokE +
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

    public int getBokE() {
        return bokE;
    }

    public void setBokE(int bokE) {
        this.bokE = bokE;
    }
}
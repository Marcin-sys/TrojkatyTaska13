package m.m.triangle.Model;

public class SzesciokatForemny extends Szesciokat {
    public SzesciokatForemny(int bokA, int bokB, int bokC, int bokD,
                             int bokE, int bokF, int obwod, int polePowierzchni) {
        super(bokA, bokB, bokC, bokD, bokE, bokF, obwod, polePowierzchni);
    }

    @Override
    public String toString() {
        return "SzesciokatForemny{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                ", bokD=" + bokD +
                ", bokE=" + bokE +
                ", bokF=" + bokF +
                ", obwod=" + obwod +
                ", polePowierzchni=" + polePowierzchni +
                '}';
    }
}

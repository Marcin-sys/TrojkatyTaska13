package m.m.triangle.Model;

public class PieciokatForemny extends Pieciokat{
    public PieciokatForemny(int bokA, int bokB, int bokC, int bokD, int bokE, int obwod, int polePowierzchni) {
        super(bokA, bokB, bokC, bokD, bokE, obwod, polePowierzchni);
    }

    @Override
    public String toString() {
        return "PieciokatForemny{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                ", bokD=" + bokD +
                ", bokE=" + bokE +
                ", obwod=" + obwod +
                ", polePowierzchni=" + polePowierzchni +
                '}';
    }
}

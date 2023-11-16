package m.m.triangle.Model;

public class PieciokatForemny extends Pieciokat {
    public PieciokatForemny(int bokA, int bokB, int bokC, int bokD, int bokE) {
        super(bokA, bokB, bokC, bokD, bokE);
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

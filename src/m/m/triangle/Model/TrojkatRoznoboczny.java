package m.m.triangle.Model;

public class TrojkatRoznoboczny extends FiguryGeometryczne{
    public TrojkatRoznoboczny(int bokA, int bokB, int bokC) {
        super(bokA, bokB, bokC);
    }

    @Override
    public String toString() {
        return "TrojkatRoznoboczny{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                ", obwod=" + obwod +
                ", polePowierzchni=" + polePowierzchni +
                '}';
    }
}

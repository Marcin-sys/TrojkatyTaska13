package m.m.triangle.Model;

public class TrojkatRownoboczny extends Trojkat{

    public TrojkatRownoboczny(int bokA, int bokB, int bokC, int obwod, int polePowierzchni) {
        super(bokA, bokB, bokC, obwod, polePowierzchni);
    }

    @Override
    public String toString() {
        return "TrojkatRownoboczny{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                ", obwod=" + obwod +
                ", polePowierzchni=" + polePowierzchni +
                '}';
    }
}

package m.m.triangle.Model;

public class TrojkatRownoboczny extends FiguryGeometryczne{


    public TrojkatRownoboczny(int bokA, int bokB, int bokC) {
        super(bokA, bokB, bokC);
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

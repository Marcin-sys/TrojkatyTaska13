package m.m.triangle.Model;

public class TrojkatRownoramienny extends FiguryGeometryczne{
    public TrojkatRownoramienny(int bokA, int bokB, int bokC, int obwod, int polePowierzchni) {
        super(bokA, bokB, bokC, obwod, polePowierzchni);
    }

    @Override
    public String toString() {
        return "TrojkatRownoramienny{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                ", obwod=" + obwod +
                ", polePowierzchni=" + polePowierzchni +
                '}';
    }
}

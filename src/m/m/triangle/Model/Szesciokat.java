package m.m.triangle.Model;

public class Szesciokat extends FiguryGeometryczne{

    int bokD;
    int bokE;
    int bokF;


    public Szesciokat(int bokA, int bokB, int bokC, int obwod, int polePowierzchni, int bokD, int bokE, int bokF) {
        super(bokA, bokB, bokC, obwod, polePowierzchni);
        this.bokD = bokD;
        this.bokE = bokE;
        this.bokF = bokF;
    }

    @Override
    public String toString() {
        return "Szesciokat{" +
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

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public int getBokC() {
        return bokC;
    }

    public void setBokC(int bokC) {
        this.bokC = bokC;
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

    public int getBokF() {
        return bokF;
    }

    public void setBokF(int bokF) {
        this.bokF = bokF;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    public int getPolePowierzchni() {
        return polePowierzchni;
    }

    public void setPolePowierzchni(int polePowierzchni) {
        this.polePowierzchni = polePowierzchni;
    }
}

package m.m.triangle.Model;

public class Trojkat {

    int bokA;
    int bokB;
    int bokC;
    int obwod;
    int polePowierzchni;

    public Trojkat(int bokA, int bokB, int bokC,
                   int obwod, int polePowierzchni) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.obwod = obwod;
        this.polePowierzchni = polePowierzchni;
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

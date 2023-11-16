package m.m.triangle.Model;

public class FiguryGeometryczne {
    int bokA;
    int bokB;
    int bokC;
    int obwod;
    int polePowierzchni;


    public FiguryGeometryczne(int bokA, int bokB,
                              int bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.obwod = obliczObwod(bokA,bokB,bokC);

    }


    @Override
    public String toString() {
        return "Nie udał sie stworzyć trojkata o: {" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC +
                '}';
    }

    public int obliczObwod(int a, int b , int c){
        return a + b + c;
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

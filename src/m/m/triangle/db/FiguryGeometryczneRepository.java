package m.m.triangle.db;

import m.m.triangle.Model.FiguryGeometryczne;

public class FiguryGeometryczneRepository {

    private final FiguryGeometryczne[] figuryGeometrycznes = new FiguryGeometryczne[5];

    public void addToRepository(int idInTab, FiguryGeometryczne figura) {
        this.figuryGeometrycznes[idInTab] = figura;
    }

    public void printAllFigury() {
        for (FiguryGeometryczne element : figuryGeometrycznes) {
            if (element == null) {
                System.out.println("Nie udało się stworzyć takiej figury");
                continue;
            }
            System.out.println(element);
        }
    }
}

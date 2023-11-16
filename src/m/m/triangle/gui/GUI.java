package m.m.triangle.gui;

import m.m.triangle.db.FiguryGeometryczneRepository;

import java.util.Scanner;

public class GUI {

    private final Scanner scanner = new Scanner(System.in);

    public String getInput() {
        String input = "";
        String[] tokens;
        int count = 2;
        while (count < 3 || count > 6) {
            System.out.println("Write your numbers to create geometric figure: ");
            input = scanner.nextLine();
            tokens = input.split(" ");
            count = 0;
            for (String temp : tokens) {
                count++;
            }
            if (count < 3 || count > 6){
                System.out.println("Error!!!");
                System.out.println("input must be min 3 numbers and max 6 numbers with space between ");
            }
        }
        return input;
    }

    public int[] tableStringToTableInt(String input) {
        String[] tokens = input.split(" ");
        int[] tab = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            tab[i] = Integer.parseInt(tokens[i]);
        }
        return tab;
    }

    public void checkWhatGeometricYouCanMake(int[] tab, int idInTable, FiguryGeometryczneRepository db) {
        int count = tab.length;
        if (count == 3) {
            //trójkąt
            GeometricFigureGUI.checkIfYouCanMakeTriangle(tab, idInTable, db);

        } else if (count == 4) {
            //     czworokąt
            GeometricFigureGUI.checkIfYouCanMakeRectangle(tab, idInTable, db);

        } else if (count == 5) {
            //     pięciokąt
            GeometricFigureGUI.checkIfYouCanMakePieciokat(tab, idInTable, db);

        } else if (count == 6) {
            //     sześciokąt
            GeometricFigureGUI.checkIfYouCanMakeSzesciokat(tab, idInTable, db);
        }
    }
}

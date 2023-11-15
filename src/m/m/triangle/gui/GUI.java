package m.m.triangle.gui;

import java.util.Scanner;

public class GUI {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getInput() {
        String input = "";
        String[] tokens;
        int count = 2;
        while (count < 3 || count > 6) {
            System.out.println("input must be with at min 3 numbers and max 6 numbers with space between ");
            System.out.println("Write your numbers to create geometric figure: ");
            input = scanner.nextLine();
            tokens = input.split(" ");
            count = 0;
            for (String temp : tokens) {
                count++;
            }
        }
        return input;
    }

    public static void sortStringToTypeOfGeometric(String input) {
        String[] tokens = input.split(" ");
        int [] tab = new int[tokens.length];
        int count = tokens.length;
        for (int i = 0; i < tokens.length; i++) {
            tab [i] = Integer.parseInt(tokens[i]);
        }

        if (count ==3) {
            //trójkąt
            GeometricFigure.checkIfYouCanMakeTriangle(tab);


        } else if (count ==4) {
            //     czworokąt
            GeometricFigure.checkIfYouCanMakeRectangle(tab);


        } else if (count == 5) {
            //     pięciokąt
            GeometricFigure.checkIfYouCanMakePieciokat(tab);

        }else if (count==6){
            //     sześciokąt
            GeometricFigure.checkIfYouCanMakeSzesciokat(tab);
        }
    }
}

package m.m.triangle.gui;

public class GeometricFigure {

    public static void checkIfYouCanMakeTriangle(int [] tab){
        int a = tab[0];
        int b = tab[1];
        int c = tab[2];

        boolean czyDaSieStworzycTrojkat = Math.abs(b - c) < a && a < b + c;

        if(czyDaSieStworzycTrojkat) {
            if (a == b && b == c) {
                System.out.println("triangle is rownoboczny");
            } else if (a==b || b==c || a ==c) {
                //trojkat rownoramienny
                System.out.println("triangle rownoramienny");
            } else {
                //trojkat rownoboczny
                System.out.println("triangle roznoboczny");
            }
        }
/*        Dla trójkątów program rozpoznaje czy podane boki tworzą trójkąt równoboczny
        (3 3 3), trójkąt równoramienny (4 4 6) czy trójkąt równoboczny (3 4 5).*/

    }
    public static void checkIfYouCanMakeRectangle(int [] tab) {
        int a = tab[0];
        int b = tab[1];
        int c = tab[2];
        int d = tab[3];
        // if ktory sprawdza czy da sie stworzyc czworokat nieformalny

        if ( a == b && b ==c && c ==d){
            System.out.println("Rectangle is rownym kwadratem ");
        }else if (a==c && b ==d){
            System.out.println("Rectangle is prostokatem");
        }else {
            System.out.println("czworokat nieforemny");
        }
/*        Dla czworokątów program rozpoznaje czy dane boki tworzą kwadrat (1 1 1 1),
                prostokąt (2 3 2 3) czy czworokąt nieforemny (4 5 6 6).*/
    }

    public static void checkIfYouCanMakePieciokat(int [] tab) {
//        Dla pięciokątów program rozpoznaje czy dane boki tworzą pięciokąt foremny (4 4 4 4 4).
        int a = tab[0];
        boolean zmienna = true;
        for (int element : tab){
            if (element == a){
                zmienna = false;
            }
        }
        if (zmienna){
            System.out.println("Stworzony zostal pieciokat foremny");
        }else {
            System.out.println("podany pieciakat nie jest foremny");
        }
    }
    public static void checkIfYouCanMakeSzesciokat(int [] tab) {
//        Dla sześciokątów program rozpoznaje czy dane boki tworzą sześciokąt foremny (7 7 7 7 7 7).
        int a = tab[0];
        boolean zmienna = true;
        for (int element : tab){
            if (element == a){
                zmienna = false;
            }
        }
        if (zmienna){
            System.out.println("Stworzony zostal szesciokat foremny");
        }else {
            System.out.println("podany szesciokat nie jest foremny");
        }
    }

}

package days.first.days.second;

/**
 * Created by Baltramiejus Jakstys on 2018-07-12.
 */
public class WelcomeClass {

    // psvm sukuria main metoda, kad pasileistu programa
    // ctr+alt+l sulygiuoja
    // ctr+shift+F10 paleidzia programa
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        // kaip iskviesti statini metoda?
        System.out.println(minus(12, 6));
        int b = minus(12, 9);
        System.out.println(b);
        // kaip iskviesti nestatini metoda?
        WelcomeClass welcomeClass = new WelcomeClass(); // sukuriamas objektas metodo iskvietimui
        welcomeClass.printName("Baltramiejus");
    }

    private void printName(String name){
        // sout iskviecia spausdinima i konsole
        System.out.println(name);

    }

    private static int minus(int numb, int numb2){
        return numb - numb2;
        // return reikalingas visuose metoduose, kur grazinama reiksme
    }
}

package days.first.days.second;

import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 2018-07-12.
 */
public class FirstTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Įveskite žodį");
        String word = scanner.nextLine();
        System.out.println(word);*/
        correctWord(scanner);
    }

    private static void correctWord(Scanner sc) {
        String word;
        do {
            System.out.println("Įveskite žodį");
            word = sc.nextLine().toLowerCase();
            printWord(word);// ToDo cia
        } while (!word.equals("pabaiga")); // contains vietoj equals iesko zodzio visame String'e
    }

    private static void printWord(String word) {
        int count = countLetters(word, 'a');
        if (word.length() % 2 == 0) {
            System.out.println("Ivestas zodis " + word + " yra lyginis, jo ilgis yra " + word.length() + ", o jame a raidziu yra " + count);
        } else {
            System.out.println("Ivestas zodis " + word + " nera lyginis, nes jo ilgis yra " + word.length() + ", o jame a raidziu yra " + count);
        }
    }

    private static int countLetters(String word, char letter) {
        // word.charAt(0)
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i); //charAt grazina indeksa raides
            if (letter == temp) {
                ;
                result++;
            }
        }
        return result;
    }
}
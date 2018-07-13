package days.second;

import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 2018-07-13.
 */
public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SecondTask secondTask = new SecondTask();
        SecondTask secondTask1 = new SecondTask();
        SecondTask secondTask2 = new SecondTask();
        SecondTask secondTask3 = new SecondTask();


        // \n reiskia nauja eilute
        System.out.println("Pasirinkite figura:\na- statusis trikampis\nb- staciakampis\nc- kvadratas\nd- apskritimas");

        String selection = scanner.nextLine();

        switch (selection) {
            case "a":
                System.out.println(secondTask.trikampioPlotas(scanner));
                break;
            case "b":
                System.out.println(secondTask1.staciakampioPlotas(scanner));
                break;
            case "c":
                System.out.println(secondTask2.kvadratoPlotas(scanner));
                break;
            case "d":
                System.out.println(secondTask3.apskritimoPlotas(scanner));
                break;
            default:
                System.out.println("Ka tu nematai galimu pasirinkimu?");
        }
    }

    private double trikampioPlotas(Scanner scanner) {
        System.out.println("Iveskite a krastines ilgi");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b krastines ilgi");
        double b = scanner.nextDouble();
        return (a * b / 2);
    }

    private double staciakampioPlotas(Scanner scanner) {
        System.out.println("Iveskite a krastines ilgi");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b krastines ilgi");
        double b = scanner.nextDouble();
        return (a * b);
    }

    private double kvadratoPlotas(Scanner scanner) {
        System.out.println("Iveskite krastines ilgi");
        double a = scanner.nextDouble();
        return (Math.pow(a, 2));
    }

    private double apskritimoPlotas(Scanner scanner){
        System.out.println("Iveskite apskritimo spinduli");
        double a = scanner.nextDouble();
        return (Math.PI * Math.pow(a, 2));
    }

}



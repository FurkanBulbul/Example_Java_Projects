package sample;

import java.util.Scanner;

public class Grade_Average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int physical, math, turkish, chemical, music, history;
        double result;

        System.out.print("Enter your physics note:");
        physical = input.nextInt();

        System.out.print("Enter your math note:");
        math = input.nextInt();

        System.out.print("Enter your turkish note:");
        turkish = input.nextInt();

        System.out.print("Enter your chemical note:");
        chemical = input.nextInt();

        System.out.print("Enter your music note:");
        music = input.nextInt();

        System.out.print("Enter your history note:");
        history = input.nextInt();

        result = (turkish + physical + math + chemical + music + history)/6.0;
        System.out.println("your average:"+" " +result);
    }

}

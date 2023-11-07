package sample;

import java.util.Scanner;

public class Basket_Amount_Calculation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double cucumber = 3.14;
        double apple = 4.11;
        double pumpkin = 2.22;
        double tomatoes = 0.95;
        double aubergine = 7.00;

        System.out.print("How many kilos of cucumbers do you want?-->" + " ");
        double cucumberWeight = scan.nextDouble();

        System.out.print("How many kilos of apples do you want?-->" + " ");
        double appleWeight = scan.nextDouble();

        System.out.print("How many kilos of pumpkins do you want?-->" + " ");
        double pumpkinWeight = scan.nextDouble();

        System.out.print("How many kilos of tomatoes do you want?-->" + " ");
        double tomatoWeight = scan.nextDouble();

        System.out.print("How many kilos of aubergines do you want?-->" + " ");
        double aubergineWeight = scan.nextDouble();

        double total = 0.0;

        total += (cucumber * cucumberWeight);
        total += (apple * appleWeight);
        total += (pumpkin * pumpkinWeight);
        total += (tomatoes * tomatoWeight);
        total += (aubergine * aubergineWeight);

        System.out.println("total amount"+" "+ total + "TL");
    }
}



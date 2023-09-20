package sample;

import java.util.Scanner;

public class Vat_Calculation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double price, total, vatPrice, rate = 18;

        System.out.print("enter amount :");
        price = scan.nextDouble();

        vatPrice = price * (rate / 100);
        total = price + vatPrice;

        System.out.println("vat rate :%"+ (int)rate);
        System.out.println("vat amount:"+ vatPrice);
        System.out.println("total vat amount:"+ total);


    }
}

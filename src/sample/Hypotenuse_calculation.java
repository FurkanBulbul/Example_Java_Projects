package sample;

import java.util.Scanner;

public class Hypotenuse_calculation {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st side");
        int a=scan.nextInt();

        System.out.print("Enter the 2st side");
        int b = scan.nextInt();

        double c = Math.sqrt((a*a)+ (b*b));

        System.out.println("hypotenuse-->"+ " "+ (int) c);


    }
}

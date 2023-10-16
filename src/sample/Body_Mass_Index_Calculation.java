package sample;

import java.util.Scanner;

public class Body_Mass_Index_Calculation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your height in meters:");
        double height = scan.nextDouble();

        System.out.print("please enter your weight:");
        double weight = scan.nextDouble();

        double index = weight / (height * height);
        System.out.println("your body mass index-->"+ " "+index);
        




    }
}

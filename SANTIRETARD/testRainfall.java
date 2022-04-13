package SANTIRETARD;

import java.util.Scanner;

public class testRainfall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rainfallInput[] = new double[12];
        double temp;
        boolean isGoodInput = false;
        for (int i = 0; i < rainfallInput.length; i++) {
            while(isGoodInput == false){
                System.out.print("Enter a rainfall amount for month " + (i + 1) + " : ");
                temp = input.nextDouble();
                if(temp < 0){
                    System.out.println("Please enter a positive rain fall amount.");
                }
                else{
                    rainfallInput[i] = temp;
                    isGoodInput = true;
                }
            }
            isGoodInput = false;
        }
        Rainfall rainfall_2021 = new Rainfall(rainfallInput);
        System.out.println("Total rainfall = " + rainfall_2021.totalRainfall());
        System.out.println("Average rainfall = " + rainfall_2021.averageRainfall());
        System.out.println("Month with least rainfall = " + rainfall_2021.leastRainfall());
        System.out.println("Month with least rainfall = " + rainfall_2021.mostRainfall());
        input.close();
    }
}

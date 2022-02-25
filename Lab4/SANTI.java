package Lab4;

import java.util.Scanner;

public class SANTI {
    public static void main(String[] args) {
        double total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter package letter (A, B, or C): ");
        String packageLetter = input.nextLine();
        System.out.println("Enter number of hours used: ");
        double hours = input.nextDouble();
        if(packageLetter.equals("a") ){
            total = 9.95 + ((hours - 10) * 2.00);
            System.out.println("Your total is: $"  + total);
        }
        else if(packageLetter.equals("b")){
            total = 13.95 + ((hours - 20) * 1.00);
            System.out.println("Your total is: $"  + total);
        }
        else if(packageLetter.equals("c")){
            total = 19.95;
            System.out.println("Your total is: $"  + total);
        }
        input.close();
    }
}

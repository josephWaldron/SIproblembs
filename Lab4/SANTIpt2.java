package Lab4;

import java.util.Scanner;

public class SANTIpt2 {
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
            if(total > 13.95 + ((hours - 20) * 1.00)){
                System.out.println("You would save $" + ((hours - 20) * 1.00) + " if you switched to plan b!");
            }
            if(total > 19.95){
                System.out.println("You would save $" + (total - 19.95) + " if you switched to plan c!");
            }
            else System.out.println("You have the optimal plan!");
        }
        else if(packageLetter.equals("b")){
            total = 13.95 + ((hours - 20) * 1.00);
            System.out.println("Your total is: $"  + total);
            if(total > 19.95){
                System.out.println("You would save $" + (total - 19.95) + " if you switched to plan c!");
            }
            else System.out.println("You have the optimal plan!");
        }
        else if(packageLetter.equals("c")){
            total = 19.95;
            System.out.println("Your total is: $"  + total);
        }
        input.close();
    }
}

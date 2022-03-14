import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class scratch {
    public static void main (String[]args) {

        double money;
        double answer = 1;

        int upperbound = 5;

        String [] Word = {"Cherries", "Oranges", "Plums", "Bells", "Melons"," Bars"};

    Scanner input = new Scanner(System.in);
    while(answer == 1){
        Random rand = new Random();
    int int_random1 = rand.nextInt(upperbound);
    int int_random2 = rand.nextInt(upperbound);
    int int_random3 = rand.nextInt(upperbound);

    //ask user to enter amount 

    System.out.printf("Enter the amount of money");

    money = input.nextDouble();

    // calculating 


    System.out.println(Word[int_random1]);

    System.out.println(Word[int_random2]);

    System.out.println(Word[int_random3]);

    if (int_random1 == int_random2 && int_random2 == int_random3 ) {
        System.out.println("Triple Amount:"+ (money * 3));
    }
    else if(int_random1 == int_random2){
        System.out.println("Double Amount:" + (money *2));
    }
    else if(int_random2 == int_random3){
        System.out.println("Double Amount:" + (money *2));
    }
    else if (int_random1 == int_random3){
        System.out.println("Double Amount:" + (money *2));
    }
    else System.out.println("Lost amount" + (money * 0));



    System.out.println("Try Again 1:Yes 2:No");

    answer = input.nextDouble();
    }
    input.close();

    }
}
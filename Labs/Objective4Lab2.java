import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter the first whole number.");
    int num1 = keyboard.nextInt();
    System.out.println("Please enter the second whole number.");
    int num2 = keyboard.nextInt();
    System.out.println("Please enter the third whole number.");
    int num3 = keyboard.nextInt();
    System.out.println("Please enter the first  intiger.");
    Double dub1 = keyboard.nextDouble();
    System.out.println("Please enter the second  intiger.");
    Double dub2 = keyboard.nextDouble();
    System.out.println("Please enter the third  intiger.");
    Double dub3 = keyboard.nextDouble();
    int sum1 = num1 + num2 +num3;
    Double sum2 = dub1 + dub2 + dub3;

    System.out.println("The Sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sum1 );
    System.out.println("The Sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + sum2);


    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}

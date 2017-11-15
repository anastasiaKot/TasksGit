import java.util.Scanner;

/**
 * Created by anastasia on 9/17/17.
 */
public class A1 {
    Scanner scanner = new Scanner(System.in);

    public void summaizeTwoNUmbers() {
        int one = (int) (Math.random() * 100);
        int two = (int) (Math.random() * 100);
        System.out.println("How much is " + one + " + " + two + "  ? Enter your answer: ");

        int answer = scanner.nextInt();
        if (answer == one + two) {
            System.out.println("Good job");
        } else
            System.out.println("Bad Job, Bad Erik!!!");

    }

    public void guessNumber() {

        int number = (int) (Math.random() * 100);
        System.out.println("Enter your guess here");
        int guess = -1;

        while (guess != number) {
             guess = scanner.nextInt();

            System.out.println("Enter your guess ");

            if (guess > number)
                System.out.println("Too high!");

            else if (guess < number)
                System.out.println("Too low!");

            else if (guess == number) {
                System.out.println("HOOORAAAY");
            }
        }
    }



}

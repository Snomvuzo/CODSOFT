package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {

//    public void generateNumber() {
        Random random = new Random();

        int num = 0;
        for (int i = 0; i < 1; i++) {
            num = (1 + random.nextInt(50));
        }
//        System.out.println(num);
//    }

//    public void getPlayerGuess(int num) {
        System.out.println(num);
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter number to guess (from 1 to 50)");
            int playerGuess = scan.nextInt();

            if (playerGuess == num) {
                System.out.println("Congratulations! You win!");
                break;
            } else if (playerGuess <  num) {
                System.out.println("Sorry! The number is higher...");
            } else {
                System.out.println("Sorry! The number is lower...");
            }
        }
//    }
//    public static void main(String[] args){
//        NumberGenerator gen = new NumberGenerator();
//        gen.generateNumber();
//        System.out.println("Hello!");
//        NumberGenerator guess = new NumberGenerator();
//        guess.getPlayerGuess(num);
//    }
//}
    }
}
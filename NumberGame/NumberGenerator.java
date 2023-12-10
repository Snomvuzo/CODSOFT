package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {
    private final Random random;

    public NumberGenerator(){
        this.random = new Random();
    }

    public void generateNumber(){
        StringBuilder num = new StringBuilder("");
        for (int i = 0; i < 1; i++) {
            num.append(1 + random.nextInt(50));
        }
        System.out.println(num);
    }

    public String getPlayerGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number to guess (from 1 to 50)");
        String playerGuess = scan.next();

        if (playerGuess.equals("exit") || playerGuess.equals("quit")){
            System.exit(0);
        }
        return playerGuess;
    }
    public static void main(String[] args){
        NumberGenerator gen = new NumberGenerator();
        gen.generateNumber();
        System.out.println("Hello!");
        NumberGenerator guess = new NumberGenerator();
        guess.getPlayerGuess();

    }

}

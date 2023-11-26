package NumberGame;

import java.util.Random;

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

    public static void main(String[] args){
        NumberGenerator gen = new NumberGenerator();
        gen.generateNumber();
//        System.out.println("Hello!");
    }

}

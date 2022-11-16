package oefeningen;

import java.util.Random;
import java.util.function.Supplier;

public class Opdracht3 {
    public static void main(String[] args) {

        Supplier <Integer> randomNumber = () -> {
            Random random = new Random();
            return random.nextInt(5);
        };
        int random = randomNumber.get();
        //System.out.println(random);
        switch (random) {
            case 1:
                System.out.println(random + " -> 25%");
                break;
            case 2:
                System.out.println(random + " -> 50%");
                break;
            case 3:
                System.out.println(random + " -> 75%");
                break;
            case 4:
                System.out.println(random + " -> 100%");
        }
        // System.out.println(random);
    }
}

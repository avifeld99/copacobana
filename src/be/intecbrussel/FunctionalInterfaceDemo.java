package be.intecbrussel;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        // runnable: -- Runnable, requires no input, doesn't give output
        Runnable timeRunnable = () -> {
            System.out.println(LocalDateTime.now());
        };
        timeRunnable.run();

        // consumer: -- Consumer<Input>, requires input, doesn't give output (return type)
        Consumer <Customer> customerConsumer = (Customer c) -> {
            System.out.println("this customer is: " + c.getAge());
        };
        customerConsumer.accept(new Customer(50));

        // supplier: -- Supplier<Output>, doesn't require anything but gives something in return
        Supplier <Integer> randomNumberSupplier = () -> {
            Random random = new Random();
            return random.nextInt(80);
        };
        int random = randomNumberSupplier.get();
        System.out.println(random);

        // function: -- Function<Input, OutPut>, requires input, gives output (return type)
        Function <String, Integer> letterCount = (String s) -> {
            return s.length();
        };
        int lengthOfWord = letterCount.apply("word");
        System.out.println(lengthOfWord);

    }
}

package oefeningen;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Opdracht1 {
    public static void main(String[] args) {

        // parameter, no return
        Consumer <String> shopping = (String cloths) -> System.out.println("buying a: " + cloths);
        shopping.accept("skirt");

        // return, no parameter
        Supplier <String> dateAndTime = () -> {
            String dateTimeNow = LocalDateTime.now().toString();
            return "locat time now is: " + dateTimeNow;
        };
        System.out.println(dateAndTime.get());

        // parameter, return
        Function <String, Integer> wordLength = (String word) -> word.length();
        System.out.println(wordLength.apply("lieveheersbeestje"));

        // no return, no parameter
        Runnable simple = () -> {
            System.out.println("leeg");
        };
        simple.run();
    }
}

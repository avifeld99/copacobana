package oefeningen;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Opdracht4 {
    public static void main(String[] args) {

        // parameter, no return
        BiConsumer<String, String> shopping = (String cloths, String color) ->
                System.out.println("buying a: " + cloths + ", color: " + color);
        shopping.accept("skirt", "red");
    }
}

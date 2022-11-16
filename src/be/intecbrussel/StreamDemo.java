package be.intecbrussel;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {


        String[] myCollectionOfStrings = {"Catapult", "catapult", "Turtle", "Blue", "blue",
                "eYes", "WhIte", "DraGon"};

        Stream.of(myCollectionOfStrings)
                .map(word -> word.toLowerCase())
                .filter(word -> word.contains("e"))
                .map(word -> word.length())
                .filter(number -> number % 2 == 0)
                .map(number -> (double) number / 2)
                .sorted()
                .forEach(word -> System.out.println(word));


        Customer[] customers = {new Customer("Annie", 30), new Customer("Pablo", 15),
                new Customer("Said", 23), new Customer("Kofi", 17),
                new Customer("Yulian", 40)};

        Customer[] legalCustomer = Stream.of(customers)
                .filter(customer -> customer.getAge() > 17)
                .map(customer -> customer.setName("slim shady"))
                //.map(customer -> customer.getAge())
                .sorted()
                //.forEach(customer -> System.out.println(customer));
                .toArray(Customer[]::new);

        System.out.println(Arrays.toString(legalCustomer));
    }
}

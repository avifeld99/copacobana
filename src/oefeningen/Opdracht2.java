package oefeningen;

import be.intecbrussel.Customer;

import java.util.Scanner;
import java.util.function.Consumer;

public class Opdracht2 {
    public static void main(String[] args) {

        Consumer <Customer> customerConsumer = (Customer c) -> {
            if (c.getAge() >= 18) {
                System.out.println("you're too old");
            } else {
                System.out.println("you're too young");
            }
        };
        customerConsumer.accept(new Customer(18));
    }
}

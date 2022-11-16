package oefeningen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Opdracht6 {

    public static void main(String[] args) {

        String[] animals = {"Cow", "ShaRk", "DOg", "PirAnha", "MouSE", "CaT", "ParRoT", "DOLphin"};
        String[] newAnimal = Stream.of(animals)
                .map(animal -> animal.toLowerCase())
                .filter(animal -> animal.contains("a"))
                .sorted(Comparator.comparing(String::length))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(newAnimal));

    }

}

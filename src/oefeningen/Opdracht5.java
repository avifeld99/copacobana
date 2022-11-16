package oefeningen;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Opdracht5 {
    public static void main(String[] args) {

        IntStream.of(5,8,640,1111,27,16)
                .map(number -> number/4)
                .filter(number -> number %8 == 0)
                .forEach(number -> System.out.println(number));

    }
}

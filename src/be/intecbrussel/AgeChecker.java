package be.intecbrussel;

@FunctionalInterface
public interface AgeChecker {

    boolean checkAge(Customer customer);
}

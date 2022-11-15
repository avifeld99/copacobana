package be.intecbrussel;

public class Customer {

    private int age;

    public Customer(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "be.intecbrussel.Customer{" +
                "age=" + age +
                '}';
    }
}

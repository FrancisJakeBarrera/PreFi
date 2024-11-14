public class Customer extends Person {
    public Customer(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name + ".";
    }
}

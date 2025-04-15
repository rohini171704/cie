// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test the inheritance
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Access method of parent class
        myDog.eat();

        // Access method of child class
        myDog.bark();
    }
}

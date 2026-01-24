package day5;

class Dog {
    private String name;
    private int age;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if(age >= 0) this.age = age;
    }
}

public class DogApp {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
        myDog.bark();
        System.out.println("Dog's Name: " + myDog.getName());

        // Using setter to update age
        myDog.setAge(4);
        System.out.println("Updated Age: " + myDog.getAge());
    }
}
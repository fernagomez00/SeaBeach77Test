package Tester;

/**
 * This is the main class to start the program
 * @author Fernando Gomez
 */
public class Main {
    
    public static void main(String[] args) {
        Dog dog = new Dog("Greg", 3, Breed.JACK_RUSSEL);
        System.out.println("Your new dog!\n"+dog);
        System.out.println("\nWhat if we just want the name?\n"+dog.name);
        System.out.println("What if we just want the age?\n"+ dog.getAge());
        System.out.println("What if we just want the breed name?\n"+ dog.breed);
        System.out.println("Are we sure its a dog?\n"+ dog.breed.animalType);
        System.out.println("Prove your a dog! woof for me");
        dog.makeSound();
        System.out.println("What are you eating?");
        dog.eat();
        System.out.println("\n");
        Cat cat = new Cat("Beans", 2, Breed.AMERICAN_SHORTHAIR);
        System.out.println("\nWhat if you want a cat?\n"+ cat);
        System.out.println("\nWhat if we just want the name?\n"+cat.name);
        System.out.println("What if we just want the age?\n"+ cat.getAge());
        System.out.println("What if we just want the breed name?\n"+ cat.breed);
        System.out.println("Are we sure its a cat?\n"+ cat.breed.animalType);
        System.out.println("Prove your a cat! Meow for me");
        cat.makeSound();
        System.out.println("What are you eating?");
        cat.eat();
        
    }
    
}

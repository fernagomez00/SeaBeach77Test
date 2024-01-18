package Tester;

/**
 * Class dog makes a basic example for a java class
 * @author Fernando Gomez
 */
public class Dog extends Animal{
    
    Dog(String name, int age, Breed breed){
        super(name, age, breed);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
    
    @Override
    public void eat(){
        super.eat();
        System.out.print("dog food!");
    }
}

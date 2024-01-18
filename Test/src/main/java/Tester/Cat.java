package Tester;

/**
 * Class cat makes a basic example for a java class
 * @author Fernando Gomez
 */
public class Cat extends Animal{

    Cat(String name, int age, Breed breed){
        super(name, age, breed);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
    
    @Override
    public void eat(){
        super.eat();
        System.out.print("cat food!");
    }
}
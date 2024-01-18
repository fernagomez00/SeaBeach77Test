package Tester;

/**
 *Animal class
 * @author Fernando Gomez
 */
public class Animal implements Eats{
    //above we implment Eats and create the function eat();
    
    //the original data members from dog and cat
    public String name;
    private int age;
    protected final Breed breed;
    
    Animal(String name, int age, Breed breed){
        this.name = name;
        this.age=age;
        this.breed = breed;
    }
    public int getAge(){
        return age;
    }
    
    //to be overriden by child classes (common behavior
    public void makeSound(){System.out.println("Sound!");}
    
    //added this function to get rid of final warning for private variable age
    public void ageUp(){
        age++;
    }
    
    //to be overriden by child classes (common behavior)
    @Override
    public void eat(){System.out.print(name + " is eating ");}
    
    //moved this toString to the parent class as to not repeat code unecessarily
    @Override
    public String toString(){
        String ret = "";
        ret += name +"\n"+getAge()+"\n"+breed.breedName;
        return ret;
    }
}

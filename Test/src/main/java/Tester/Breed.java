package Tester;
/**
 * Enum breed stores the name of the breed and puts an animal type to the breed
 * @author Fernando Gomez
 */
public enum Breed {
    //This enumeration allows for easy additions of more breeds for all kinds of different animals
    DEFAULT("default animal", AnimalType.NA),
    //The dogs below
    GOLDEN_RETRIEVER("Golden Retriever", AnimalType.DOG),
    LABRADOR("Labrador", AnimalType.DOG),
    JACK_RUSSEL("Jack Russel", AnimalType.DOG),
    //The cats below
    PERSIAN("Persian", AnimalType.CAT),
    SIAMESE("Siamese", AnimalType.CAT),
    AMERICAN_SHORTHAIR("American Shorthair", AnimalType.CAT);
    
    final String breedName;
    final AnimalType animalType;
    //both of these cant be changed so once they are constructed they are immutable
    
    Breed(String breedName, AnimalType animalType) {
        this.breedName = breedName;
        this.animalType = animalType;
    }
    
    @Override
    public String toString(){
        return breedName;
    }
}

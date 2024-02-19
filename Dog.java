public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String species, boolean isMammal, String breed) {
        super(name, age, species, isMammal);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

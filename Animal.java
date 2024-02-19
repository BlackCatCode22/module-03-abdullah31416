public class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, String species, boolean isMammal, String breed) {
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

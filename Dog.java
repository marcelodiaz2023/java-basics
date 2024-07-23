public class Dog {
    private String name = "";
    private String breed = "";

    public void setName(String newName) {
        this.name = newName;
    }

    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Brownie");
        dog1.setBreed("Sitso Dog");

        Dog dog2 = new Dog();
        dog2.setName("Blackie");
        dog2.setBreed("Siwawa");

        System.out.println("name: " + dog1.getName() + " ,breed: " + dog1.getBreed());
        System.out.println("name: " + dog2.getName() + " ,breed: " + dog2.getBreed());
    }
}

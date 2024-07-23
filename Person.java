public class Person {
    private String name;
    private int age;

    public Person(String nameInput, int ageInput) {
        this.name = nameInput;
        this.age = ageInput;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Madi", 20);
        Person person2 = new Person("Paul", 35);

        System.out.println("name: " + person1.name + " ,age: " + person1.age);
        System.out.println("name: " + person2.name + " ,age: " + person2.age);
    }
}
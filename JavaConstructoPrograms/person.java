public class person {
    
    String name;
    int age;

    public person() {
        name = "Arun";
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        person person1 = new person();
        person person2 = new person("Bob", 30);

        System.out.println(person1.name + " " );
        System.out.println(person2.name + " " + person2.age);
    }
}


class Person {

    void introduce() {
        System.out.println("I am a person.");
    }
}

class Employee extends Person {

    void introduce() {
        System.out.println("I am an employee.");
    }

    void specificIntroduce() {
        super.introduce();
        System.out.println("I work at a company.");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
     
        Employee emp = new Employee();

        emp.introduce();
        emp.specificIntroduce();
    }
}


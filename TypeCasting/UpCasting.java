public class UpCasting {

    int age = 32;
    }
    class Person extends UpCasting{
        int age = 23;
        public static void main(String[] args) {

            UpCasting u = new Person();
            System.out.println(u.age);
            UpCasting u1 = new Person();
            Person p = (Person) u1; //down casting
            System.out.println(p.age);
            
    }
    }
    


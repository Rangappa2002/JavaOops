public class GeneralizationExample {

    public void greeting(){
        System.out.println("Good morning Sir");
    }   

    public static void main(String[] args) {
        GeneralizationExample s = new Student();
        s.greeting();
         s = new Teacher();
        s.greeting();
    }
    
}
class Student extends GeneralizationExample{

    public void greeting(){
        System.out.println("Good morning Sir"); 
    }
}
class Teacher extends GeneralizationExample{

    public void greeting(){
        System.out.println("Good morning");
    }
}
public class SpecilizationExample {

    public void greetings(){
        System.out.println("Hii");
    }
    public static void main(String[] args) {
        SpecilizationExample s = new Students();
        s.greetings();
        SpecilizationExample s1 = new Teachers();
        s1.greetings();
    }
    
}
class Students extends SpecilizationExample{

    public void greetings(){
        System.out.println("Good morning Sir"); 
    }
}
class Teachers extends SpecilizationExample{

    public void greetings(){
        System.out.println("Good morning");
    }
}

public class ctp {

    public void Student(String name){
        System.out.println(name);
    }

    public void Student(String name, int age){
        System.out.println(name+" "+age);
    }

    public void Student(String name, int age , String USN){
        System.out.println(name+" "+age+" "+USN);
    }

    public static void main(String[] args) {
        ctp c = new ctp();
        c.Student("Rangappa");
        c.Student("Rangappa", 21);
        c.Student("Rangappa", 21, "4GH20CS054");
    }
    
}
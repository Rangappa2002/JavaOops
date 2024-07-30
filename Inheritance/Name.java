//   Hierarchical inheritance

public class Name {

    void name(){
        System.out.println("Enter your Name: ");
    }
    
}

class fname extends Name{
    void show(){
        String name = "Arun";
        System.out.println("My name is "+name);
    }
}
class lname extends Name{
    void dis(){
        System.out.println("My Name is Ajay");
    }
}
class Sname{

    public static void main(String[] args) {
        lname l = new lname();
        fname f = new fname();
        l.name();
        l.dis();
        f.name();
        f.show();
    }
}

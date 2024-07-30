interface Rang{
    public static final String name = "Rangappa";
    public abstract void show();
}

 class fullName implements Rang{
    public void show(){
        System.out.println("fullName:" +name);
    }
}

public class interfaceExample2 {
    public static void main(String[] args) {
        Rang r = new fullName(); 
        r.show();
    }
}

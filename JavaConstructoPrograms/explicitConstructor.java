public class explicitConstructor {
    explicitConstructor(String name){
        System.out.println("Hi " + name);
    }
}
 class InnerexplicitConstructor extends explicitConstructor{

    InnerexplicitConstructor(){
        super("Rangappa");
        System.out.println("welocome");
    }
    public static void main(String[] args) {
        new InnerexplicitConstructor();
    }
}
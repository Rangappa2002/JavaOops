public class NonStatic {

    {
        System.out.println("hii");
    }
    {
        System.out.println("hlo");
    }
    public static void main(String[] args) {
        NonStatic nn= new NonStatic();
        {
            System.out.println("how are you");
        }
        
    }
    
}

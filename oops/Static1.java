public class Static1 {

    static {
        System.out.println("hii");
    }
   
    {
        String Name = "Arun";
        System.out.println(Name);
    }

    public static void main(String[] args) {
        Static1 st = new Static1();
    }
}

public class NonStatc {
    
    int num;
    String str;

    {
        num = 42;
        str = "Hello, World!";
    }

    public void display() {
        System.out.println("num: " + num);
        System.out.println("str: " + str);
    }

    public static void main(String[] args) {
        NonStatc obj = new NonStatc();
        obj.display();
    }
}

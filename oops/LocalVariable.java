public class LocalVariable {

    public class Add {
        int a =29;
        int b=5;
        int c=a+b;
    }
    public static void main(String[] args) {
        LocalVariable lv = new LocalVariable();
        Add a = lv.new Add();
        System.out.println(a.c);
    }
    
}

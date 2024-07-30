public class Super {
    
    
    int a = 12;
    
}
class sub extends Super{

    int a = 34;
    void dis(){
        System.out.println(a);
    }
}
class wa{
    public static void main(String[] args) {
        sub s = new sub();
        s.dis();
    }
}

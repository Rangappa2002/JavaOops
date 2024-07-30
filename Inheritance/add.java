//   Multiple inheritance java not support
public class add {

    void ad(){
        int a,b,c;
        a = 12;
        b = 2;
        c = a+b;
        System.out.println("Addition: "+c);
    }
    
}
class sub {
    void ad(){
        int a,b,c;
        a = 12;
        b = 2;
        c = a+b;
        System.out.println("Addition: "+c);
    }
}
class Cc extends  add,sub {
    
    void sub(){
        int a,b,c;
        a = 3;
        b = 3;
        c = a-b;
        System.out.println("Sub: "+c);
    }
    public static void main(String[] args) {
        Cc cc = new Cc();
        cc.ad();
        cc.sub();
    }

}
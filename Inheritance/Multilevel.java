public class Multilevel {

    String name = "Arun";
    int age = 34;
    
    void d(){
        System.out.println(name+" "+age);
    }
    }
    
class Demo1 extends Multilevel{

    void fun2(){
        System.out.println(name);
        System.out.println(age);
    }

}
class Demo2 extends Demo1{

    void fun3(){
        name = "Ajay";
        age = 23;
        System.out.println(name+" "+age);
    }
    
}
class Demo3 extends Demo2{
public static void main(String[] args) {
    Demo3 d = new Demo3();
    d.d();
    d.fun2();
    d.fun3();
}
}
    // Multi level inheritance
 class A {
    int a, b, c;
    void add(){
        a = 12;
        b = 13;
        c = a + b;
        System.out.println("Addition: "+c);
    }
    void sub(){
        a = 223;
        b = 12;
        c = a - b;
        System.out.println("Subtraction: "+c );
    }
}
class B extends A{

    void mul (){
        a = 23;
        b = 43;
        c = a * b;
        System.out.println("Multiplication: "+c);

    }
} 
class C extends B{
    void div(){
        a =234;
        b = 34;
        c = a / b;
        System.out.println("Division: "+c);

    }
    public static void main(String[] args) {
        C d = new C();
        d.add();
        d.sub();
        d.mul();
        d.div();
    }
}

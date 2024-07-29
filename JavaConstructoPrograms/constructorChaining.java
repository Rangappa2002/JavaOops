public class constructorChaining {
    
    constructorChaining(){
        System.out.println("Hii");
    }
    constructorChaining(int age){
        System.out.println(age);
    }
    constructorChaining(float salary){
        System.out.println(salary);
    }
    public static void main(String[] args) {
        constructorChaining c = new constructorChaining();
        constructorChaining c1 = new constructorChaining(21);
        constructorChaining c2 = new constructorChaining(120.0f);    }
}

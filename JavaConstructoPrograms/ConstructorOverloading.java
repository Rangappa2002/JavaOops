public class ConstructorOverloading {

    String ProductName ;
    int Age;
    float Salary;
    
    public ConstructorOverloading(String Name, int age){
        ProductName = Name;
        Age = age;

    }
    public ConstructorOverloading(float salary){
        Salary = salary;
    }
    public static void main(String[] args) {
        ConstructorOverloading cc1 = new ConstructorOverloading("Arun",55 );
        ConstructorOverloading cc2 = new ConstructorOverloading(29000);
        System.out.println(""+cc1.ProductName+" "+cc1.Age+" "+cc2.Salary);
    }
    

}

import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Employee emp1 = new Employee(101,"Arun" ,11000);
        Employee emp2 = new Employee(102,"Arun" ,11000);
        Employee[] emp = {emp1, emp2};
        for(int i=0; i<emp.length; i++){
            System.out.println("ID: "+emp[i].id+"  NAME: "+emp[i].name+"  SALARY: "+emp[i].salary);
        }

        
    }
    
}

class Employee{
    int id;
    String name;
    long salary;

    public Employee(int id, String name, long salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}
    
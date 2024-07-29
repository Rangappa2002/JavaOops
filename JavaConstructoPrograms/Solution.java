public class Solution {

    public static void main(String[] args) {
        Student stu1 = new Student("arun",34);
        Student stu2 = new Student("Ajay", 30);
        Student[] stu = {stu1,stu2};
        for(int i=0; i<stu.length; i++){
            System.out.println("Name: "+stu[i].name+ "  Age: "+stu[i].age);
        }

        
    }
}
    class Student{
        String name;
        int age;
    
    public  Student(String name, int age) {
        this.name = name;
        this.age = age;
    
        
    }
    }
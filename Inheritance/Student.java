            //single level inheritance


public class Student {

    int USN;
    String name;
    void fun(){
       USN = 7254;
       name = "Arun";
    }
    
}
class Arun extends Student{
   
   void disp(){ 

    System.out.println(USN+ " "+name);
   }
   

    public static void main(String[] args) {
        Arun a = new Arun();
        a.fun();
        a.disp();
        
    }
}
public class Account{

     int accNum = 1234;
     int pin = 232;
}

class Hacker extends Account{
    void disp(){
        System.out.println(accNum);
        System.out.println(pin);
    }
    void changeData(){
        accNum = 7688;
        pin = 221;
        System.out.println(accNum+" "+pin );
    }
}
class Demo{
    public static void main(String[] args) {
        Hacker h = new Hacker();
        h.disp();
        h.changeData();
        h.disp();
    }
}
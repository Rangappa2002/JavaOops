interface Vehicle {
    
    public void Start();
    public void Stop();
}
    class Bike implements Vehicle{
        public void Start(){
            System.out.println("Bike Start");
        }
        public void Stop(){
            System.out.println("Bike Stop");
        }
    }
    public class interfaceExample {
    
        public static void main(String[] args) {
            Vehicle b = new Bike();
            b.Start();
            b.Stop();
        }
    }


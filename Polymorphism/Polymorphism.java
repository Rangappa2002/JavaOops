public class Polymorphism {
    public void Start() {
        System.out.println("Polymorphism Start");
    }

    public void Stop() {
        System.out.println("Polymorphism Stop");
    }

    static class Bike extends Polymorphism {
        @Override
        public void Start() {
            System.out.println("Bike Start");
        }

        @Override
        public void Stop() {
            System.out.println("Bike Stop");
        }
    }

    static class Scooty extends Polymorphism {
        @Override
        public void Start() {
            System.out.println("Scooty Start");
        }

        @Override
        public void Stop() {
            System.out.println("Scooty Stop");
        }
    }

    public static void main(String[] args) {
        Polymorphism p = new Bike();
        Polymorphism p1 = new Scooty();
        p.Start();
        p.Stop();
        p1.Start();
        p1.Stop();
    }
}

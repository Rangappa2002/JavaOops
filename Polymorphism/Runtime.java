public class Runtime {

    public void Student() {
        System.out.println("Hi");
    }

    static class Boy extends Runtime {
        @Override
        public void Student() {
            System.out.println("Boys");
        }
    }

     class Girls extends Runtime {
        @Override
        public void Student() {
            System.out.println("Girls");
        }
    }

    public static void main(String[] args) {

        Runtime ru = new Runtime();
        Runtime r1 = new Runtime();
        r1.Student();

        Runtime r2 = new Boy();
        r2.Student();

        Runtime r3 = ru.new Girls();
        r3.Student();
    }
}

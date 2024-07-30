 class display{

    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public class Encapsulation {
    
        public static void main(String[] args) {
            display d = new display();
            d.setName("Rangappa");
            System.out.println(d.getName());
        }
    }

}
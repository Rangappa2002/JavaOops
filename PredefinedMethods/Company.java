public class Company {
     
    String name = "HyperNxt";
    public static void main(String[] args) {
        Company c = new Company();
        Company c1= new Company();
        System.out.println(c.equals(c1));
    }
    public boolean equals(Company ca){
        return true;
    }
    
}

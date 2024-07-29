public class Parameterized{

    String ProductName;
    int Prise;

    public Parameterized(String Name,int MRP){
        ProductName = Name;
        Prise = MRP;   
    }
    public static void main(String[] args) {
        Parameterized pr = new Parameterized("Oppo",45000);
        System.out.println(pr.ProductName+" "+pr.Prise);
    }
  
}
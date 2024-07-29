public class NonParameterized {

    String ProductName ;
    int Prise;

    public NonParameterized(){
        ProductName = "Oppo";
        Prise = 23211;
    }
    public NonParameterized(String name,int prs){
        ProductName = name;
        Prise = prs;

    }
    public static void main(String[] args) {
        NonParameterized nn = new NonParameterized();
        System.out.println(""+nn.ProductName+" "+nn.Prise);

        NonParameterized nn1 = new NonParameterized("Iphone",120000);
        System.out.println(""+nn1.ProductName+" "+nn1.Prise);
    }
    
}

public class ThisKeyword {
    int num = 10;

    public void display(int num){
        this.num = num;
    }
public static void main(String[] args) {
    ThisKeyword m = new ThisKeyword();
    m.display(45);
    System.out.println(""+m.num);
}
}

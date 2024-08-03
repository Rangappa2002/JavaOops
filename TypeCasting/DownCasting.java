public class DownCasting {
    int age = 34;
    
}
class Per extends DownCasting{
    int page = 23;
    public static void main(String[] args) {
        DownCasting d = new Per();
        DownCasting dd = new as();
        Per p = (Per) d;
        as a = (as) dd;
        System.out.println(p.page);
        System.out.println(a.age1);
    }
}
class as extends DownCasting{
    int age1 = 2;
}

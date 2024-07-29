public class MemberVariable {

    int a=29;
    int b=2;
    int c;
    public static void main(String[] args) {
        MemberVariable mv = new MemberVariable();
        mv.c = mv.a + mv.b;
   
        System.out.println(mv.c);
    
    }
    
}

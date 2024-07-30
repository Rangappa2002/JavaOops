// public class Father {
//     String name ;

//     Father(String name){
//         this.name = name;
//     }
//     public static void main(String[] args) {
//         Father f = new Father("Arun");
//         Father f1 = new Father("Arun");
//         System.out.println(f.equals(f1));
//     }
//     public boolean equals(Object obj){
//         Father fff = (Father) obj;
//         return name.equals(fff.name);
//     }
// }
public class Father {
    String name = "Arun";

    public static void main(String[] args) {
        Father f = new Father();
        Father f1 = new Father();
        Father f2 = new Father();
        System.out.println(f.equals(f1));
        System.out.println(f1.equals(f2));
    }
    public boolean equals(Object obj){
        Father fff = (Father) obj;
        return name.equals(fff.name);
    }
}
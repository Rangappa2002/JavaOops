
class Parent {
    protected void show() {
        System.out.println("Parent's show()");
    }
}


class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child's show()");
    }
}

public class MethodOverrinding2 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); 
}
}
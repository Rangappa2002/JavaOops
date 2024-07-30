

class Animal {
    
    public void eat() {
        System.out.println("Animal makes eats ");
    }
}


class Lion extends Animal {
   
    @Override
    public void eat() {
        System.out.println("Dog eats Non veg");
    }
}


class Cow extends Animal {
    
    @Override
    public void eat() {
        System.out.println("Cat eats veg");
    }
}


public class MethodOverrinding {
    public static void main(String[] args) {
        
        Animal myAnimal = new Animal(); 
        Animal myLion = new Lion();       
        Animal myCow = new Cow();       

       
        myAnimal.eat(); 
        myLion.eat();    
        myCow.eat();    
    }
}

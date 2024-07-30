abstract class Music {
    abstract void playSong(String name);
}

class Telugu extends Music{
    void playSong(String name){
        System.out.println(name);
    }
}

class Kannada extends Telugu{
    void playSong(String name){
        System.out.println(name);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Music m = new Telugu();
        m.playSong("Song1");
        Telugu k = new Kannada();
        k.playSong("Song2");
    }
    
}

package bank;
class Animal{
    void eating(){
        System.out.println("Eating");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("meow");
    }
}
class kitten extends cat{
    void makesound(){
        System.out.println("little meow");
    }
}
public class singleinheritence {
    public static void main(String[] args) {
        kitten obj = new kitten();
        obj.eating();
        obj.sound();
        obj.makesound();

    }

    
}

class Animal {
    
    private String name;

    
    public Animal(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    protected void makeSound() {
        System.out.println("Animal is making a sound!");
    }

    
    public void secret() {
        System.out.println("This is a secret method.");
    }
}


class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks!");
    }

    
    public void showSecret() {
        secret(); 
    }
   
}


public class AccessModifierExample {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Generic Animal");
        System.out.println("Animal Name: " + animal.getName());
        animal.makeSound();  

        
        Dog dog = new Dog("Buddy");
        System.out.println("Dog Name: " + dog.getName());
        dog.makeSound();  
    }
}


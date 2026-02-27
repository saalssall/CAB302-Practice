public class Dog extends Animal {

    String type = "Dog";
    public void printType(){
        System.out.println(super.type);
    }
    public void animalSound() {
        super.animalSound();
        System.out.println("The dog says: bow bow");
    }

    Dog(){
        super();
        System.out.println("Dog is created.");
    }
}

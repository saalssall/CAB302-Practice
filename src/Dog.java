public class Dog extends Animal {

    private String name;
    public String gender;

    public String getName () { 
        return name; }

    public void setName (String name ) {
        this.name = name;
    }

    final int age = 200;





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


public class Car {

    private String model;
    private int year;
    private String make;
    private String colour;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void Speed(int maxSpeed) {
        System.out.println("The car speed is : " + maxSpeed);
    }

    @Override
    public String toString() {
        return "Car [make=" + make
                + ", model=" + model
                + ", colour=" + colour
                + ", year=" + year + "]";
    }

    //A constructor with four paramater
    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    //A constructor with three paramater
    public Car(String make, String model, String colour) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

    //A constructor with two paramater
    public Car(int year, String make) {
        this.year = year;
        this.make = make;
    }

    //A constructor with one paramater // constructor chaining
    public Car(String make) {
        this(2023, "Mazda");
    }

    public Car() {
        //Default constructor
    }

}

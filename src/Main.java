import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String name = "John";
//        System.out.println("Hello\n" + name);

        int myNum = 150000;
//        System.out.println(myNum);

        String Lastname = "Adam Smith";
//        System.out.println(Lastname);

        final String firstName;
        firstName = "Parker";
//        System.out.println(firstName);

        float floatNum = 5.99f;
//        System.out.println(floatNum);

        char character = 'D';
//        System.out.println(character);

        Boolean boolvalue = true;
//        System.out.println(boolvalue);
//
//        System.out.println("Hello " + firstName);
//        System.out.println("Hello " + name + "\n" + firstName);

        //Adding parantheses is truly a life saver here
        int numb = 5;
        int nextNum = 6;
//        System.out.println("The sum of these two is " + (numb + nextNum));

        float f1 = 35e3f;
        double d1 = 12E4d;
//        System.out.println(f1);
//        System.out.println(d1);

        var x = 5;
//        System.out.println(x);
//        System.out.println(name.getClass()); //Getting the data type of the variable

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Toyota Corolla 2013");
        cars.add("Mercedez Benz 2020");
        cars.add("Nissan Corolla 2009");
        cars.add("Mazda two 2016");

//        System.out.println(cars);

        // With var
        //var cars = new ArrayList<String>();

//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter username");

//        String userName = myObj.nextLine();
//        int age = myObj.nextInt();
//        System.out.println("Username is: " + userName);
//        System.out.println("Username age is: " + age);

        //Practicing the dog and animal objects
//        Dog myDog = new Dog();
//        myDog.animalSound();
//        myDog.printType();

        //Type casting (narrowing casting)
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);

        int maxScore = 500;
        int userScore = 423;
        double Percentage = (double) userScore / maxScore * 100.0d;
        System.out.println("User percentage is " + Percentage);

//        maxScore++;
//        System.out.println(maxScore);
//        ++maxScore;
//        System.out.println(maxScore);

        int score = maxScore / userScore;
        System.out.println(score);

        String text = " This is a long string but i think it is not that long.    ";
        String text1 = "This is the second piece of text";
        System.out.println(text.length());
        System.out.println(text.lastIndexOf('b'));
        System.out.println(text.lastIndexOf("but"));
        System.out.println(text.charAt(20));
        System.out.println(text);
        System.out.println(text.trim());

        System.out.println(text.concat(text1));



    }
}







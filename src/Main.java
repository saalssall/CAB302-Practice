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
//        double myDouble = 9.78d;
//        int myInt = (int) myDouble;
//        System.out.println(myDouble);
//        System.out.println(myInt);
//
//        int maxScore = 500;
//        int userScore = 423;
//        double Percentage = (double) userScore / maxScore * 100.0d;
//        System.out.println("User percentage is " + Percentage);

//        maxScore++;
//        System.out.println(maxScore);
//        ++maxScore;
//        System.out.println(maxScore);

//        int score = maxScore / userScore;
//        System.out.println(score);

//        String text = " This is a long string but i think it is not that long.    ";
//        String text1 = "This is the second piece of text";
//        System.out.println(text.length());
//        System.out.println(text.lastIndexOf('b'));
//        System.out.println(text.lastIndexOf("but"));
//        System.out.println(text.charAt(20));
//        System.out.println(text);
//        System.out.println(text.trim());

//        System.out.println(text.concat(text1));
//
//        String txt1 = "Hello World!";
//        String txt2 = "Hello World!";
//        System.out.println(txt1.equals(txt2));
//
//        System.out.println(txt1.concat(txt2));
//       String result =  txt1.concat(txt2);
//       System.out.println(result);

       int time = 20;
//       if (time < 18){
//           System.out.println("Good day");
//       } else {
//           System.out.println("Good morning");
//       }

//        String result = (time < 18) ? "Good day." : "Good morning.";
//        System.out.println(result);
//        System.out.println((time > 18) ? "Good day." : "Good morning.");
//        String message = (time < 18) ? "Good morning" : (time > 18) ? "Good afternoon" : "Good evening";
//        System.out.println(message);

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;

//        if ((securityLevel >= 3) && isAdmin) {
//            System.out.println("Access denied.");
//        }
//        else if ((securityLevel <= 1) && isAdmin) {}
//            System.out.println("Access granted.");
//        }

//        if (isLoggedIn && (isAdmin || securityLevel == 2)) {
//            System.out.println("Access granted.");
//        }
//        else {
//
//                System.out.println("Access denied.");
//        }

       // int myNum = 5;

//        System.out.print(myNum);
//
//        if (myNum % 2 == 0){ //Is the remainder 0 after division?
//            System.out.print(myNum + " is even.");
//        }
//        else {
//            System.out.print(myNum + " is odd.");
//        }

//        int countDown = 5;
//
//        while (countDown > 0) {
//            System.out.println("Happy New Year!");
//            countDown--;
//        }
        //Will never run
//        int i = 10;
//
//        while (i < 5) {
//            System.out.println("This will never be printed");
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 4);

//
//        String name1 = "";
//
//        do {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter your name: ");
//            name1 = input.nextLine();
//        } while (name1 == null);

//        int i = 10;
//
//        do {
//            System.out.println(i);
//        } while (i < 5);

//        int dice = 1;
//
//        while (dice <= 6) {
//            if (dice < 6){
//                System.out.println("No Yatzy");
//            }
//            else if (dice == 6){
//                System.out.println("Yatzy");
//            }
//            dice += 1;
//        }

        ArrayList <String> cars1 = new ArrayList<String>();

        cars1.add("Toyota Corolla 2013");
        cars1.add("Mercedez Benz 2020");
        cars1.add("Nissan Corolla 2009");
        cars1.add("Mazda two 2016");
        cars1.add(0, "Toyota RAV 4");

        //Equavalent to the below lines

//        for (String car : cars1){
//            System.out.println(car);
//        }
//        System.out.println("-----------------------");
        //Creating an iterator
//        Iterator <String> it = cars1.iterator();
//        //Iterating through the array
//
//        while (it.hasNext()){
//            String car = it.next();
//            if (car.equals("Toyota Corolla 2013")){
//                System.out.println("Found the car!");
//            }
//            if  (car.equals("Mercedez Benz 2020")){
//                it.remove();
//                System.out.println("Removed Mercedez Benz 2020.");
//            }
//        }
        //Modifying elements of the array
//        cars1.set(3, "Mitsubishi Outlander 2022");
//        System.out.println(cars1.get(0));
//        System.out.println(cars1);
//        System.out.println(cars1.get(3));
//        cars1.remove(2);
//        System.out.println(cars1);
//        System.out.println(cars1.size());
//        cars1.clear();

        ArrayList <String> cars2 = new <String> ArrayList();
        cars2.add("Toyota Corolla 2013");
        cars2.add("Mercedez Benz 2025");
        cars2.add("Toyota Prado 2009");
        cars2.add("Nissan Rav4 2021");

        for (int i = 0; i <cars2.size(); i++){
            System.out.println(cars2.get(i));
        }

        System.out.println("---------------------");
        for (String car: cars2)
        {
            System.out.println(car);
        }
        System.out.println("---------------------");
        Collections.sort(cars2);
        for (String car: cars2){
            System.out.println(car);
        }
       String result = (cars2.equals("Toyota Corolla 2013")) ?
               "Found it!" :
               "Not found it!";
        System.out.println(result);












   }


}








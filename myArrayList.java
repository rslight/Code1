import java.util.ArrayList;
import java.util.Collections;

/**
 * Robert Lightfoot
 * CSCE 111
 * Array List examples
 * myArrayList
 */
public class myArrayList {
    public static void main(String[] args) {
        ArrayList<String> myCars = new ArrayList<>();

        System.out.println("my car list is " + myCars.size() + " long.");
        myCars.add("Olds 88");
        myCars.add("VW Fastback");
        myCars.add("Dodge Colt");
        myCars.add("Datsun 240z");
        System.out.println("my car list is " + myCars.size() + " long.");

        myCars.add("Thunderbird");
        myCars.add("Ford Ranger");
        myCars.add("Dodge Ram");
        myCars.add("Ford F250");
        myCars.add("Ford F150");

        System.out.println("my car list is " + myCars.size() + " long.");


        String[] ourCars = new String[]{"F150", "Flex", "BMW vert", "Subaru Forrester", "Bronco"};

        myCars.remove("Dodge Colt");
        for (String c : myCars) {
            System.out.println(c);
        }

        for (String c : ourCars) {
             System.out.println(c);

        }
        System.out.println("my current car list is " + ourCars.length + " long.");

        String thisCar = myCars.get(3);

        System.out.println(" I have a " + thisCar);

        thisCar = myCars.remove(3);
        System.out.println("I sold " + thisCar);

        Collections.sort(myCars);
        System.out.println("Sorted cars");
        for (String c : myCars) {
            System.out.println(c);
        }       

    }
    
}
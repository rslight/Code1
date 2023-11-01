/**
 * Robert Lightfoot
 * Unit test example
 * testMyString
 */
public class testMyString {

    public static void main(String[] args) {
        System.out.println("testing reverse ");
        System.out.println("sent Robert " + myString.reverse("Robert"));
        System.out.println("sent 123456 " + myString.reverse("123456"));
        System.out.println("sent Now is the time. " + myString.reverse("Now is the time."));
        System.out.println("sent nothing." + myString.reverse(""));

        System.out.println("Testing all Digits");
        System.out.println("Sent 123456 " + myString.allDigits("123456"));
        System.out.println("Sent 123abc " + myString.allDigits("123abc"));
        System.out.println("Sent 12 3 " + myString.allDigits("12 3 "));

        System.out.println("Testing padLeft");
        System.out.println("Sent 123, 2 " + myString.padLeft("123", 2));
    }
}
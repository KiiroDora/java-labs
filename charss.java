package Uni;
import java.util.*;
public class charss {
    public static void main(String[] args) {
        char unichar = '\u0012'; //unicode for arrows
        char ch = 'a';
        System.out.println(unichar);
        for (char i = ch; i <= 'z'; i++) {
            System.out.print(i); //prints out the alphabet
        }
        System.out.println("\n");

        //write more stuff abt chars//

        //STRING BOOLEAN TESTS//

        String str = "alksjdlaksj";
        System.out.println(str.contains("e"));
        System.out.println(str.startsWith("a"));
        System.out.println(str.endsWith("j"));
        System.out.println(str.equals("alksjdLAKSj"));
        System.out.println(str.equalsIgnoreCase("alksjdlaksj"));
        System.out.println("\n");

        //RANDOM//

        Random rand = new Random();
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(101)); //0-100
        System.out.println(rand.nextInt(10, 100)); //10-99
        System.out.println(rand.nextInt(91) + 10); // use this for class instead bc the lessons are primitive ig lol
        System.out.println(rand.nextDouble()); //0.0-1.0
        System.out.println(rand.nextDouble(10.0)); //0.0-9.9
    }
}

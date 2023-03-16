package Uni;
import java.util.Scanner;

public class input {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("enter a string");
        String name = scan.next();
        System.out.println(name + " has " + name.length() + " letters and starts with " + name.substring(0, 1));
        System.out.println(name.substring(0,1).toUpperCase() + "Diddy " +
         name.substring(name.indexOf(".") + 1) + " "  
         + name.substring(0 , name.indexOf(".")) + "-izzle" ); 
    }
}

package Uni;

import java.util.*; //imports everything under Java.util

public class lab5 {
    static Scanner scan = new Scanner(System.in);
    
    public static void lastdigit() {
        System.out.println("Please enter an integer");
        int num = scan.nextInt();
        System.out.println("the last digit of " + num + " is " + 
        String.valueOf(num).substring(String.valueOf(num).length() - 1, String.valueOf(num).length()));
    }

    public static void circarea(double radius) {
        System.out.println("the area of a circle with a radius of " + radius + " is " + radius*radius*Math.PI);
    }

    public static void dist(int x1, int y1, int x2, int y2) {
        System.out.println("the distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " +
         Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public static void pay() {
        System.out.println("Please enter a salary per hour (use comma as a separator if it's not an)");
        float sal = scan.nextFloat();
        System.out.println("Please enter the total work hours (8 and over will be overtime and be paid %50 more))");
        int hour = scan.nextInt();
        if (hour <= 8) {
            System.out.println("Your pay is " + sal * hour); 
        }
        else {
            System.out.println("Your pay is " + (8*sal + (hour-8)*sal*(1.5)));
        }
        
    }

    public static void tri(double a, double b, double c) {
        double s = (a + b + c)/2;
        System.out.println("The area of a triangle with side lengths of " + a + " " +  b + " and " + c + " is " +
        Math.sqrt(s * (s - a ) * (s - b) * (s - c)));
    }
    public static void main(String[] args) {
        lastdigit();
        circarea(2);
        dist(3,4,-3,-4);
        tri(8, 5.2, 7.1);
        pay();
    }
}

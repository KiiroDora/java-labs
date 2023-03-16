package Uni;
import java.util.Scanner;

public class lab2 {
    static Scanner scan = new Scanner(System.in);

    public static void calc() {
        double t = scan.nextInt();
        double so = scan.nextInt();
        double vo = scan.nextInt();
        double a = scan.nextInt();
        double s = so + vo * t + 1/2 * a * t * t;
        System.out.println(s);
    }

    public static void count() {
        for (int i = 1; i<=100; i++) {
            System.out.println(i);
        } 
    }
    
    public static void sqrcount() {
        for (int b = 1; b<=10; b++) {
            System.out.print(b*b + " ");    
        } 
    }

    public static int sum() {
        int a = 0;
        for (int k = 1; k<=10; k++) {
            a += k; 
        }
        return a;
    }

    public static void main(String[] args) {
        sqrcount();
        String a = "aAAba";    
        System.out.println();
        System.out.println(sum() + sum());
        System.out.println(a.indexOf("b") + " " + a.substring(0,3).toLowerCase() + " " + a.length());
    }
}



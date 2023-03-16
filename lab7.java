package Uni;

import java.util.Scanner;

public class lab7 {

    static Scanner scan = new Scanner(System.in);

    public static void printRange(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }

        else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }   

    public static void gradertwo() {
        System.out.println("Enter how many numbers you want to input.");
        int inpnum = Math.abs(scan.nextInt());
        System.out.println("Enter a number to be compared.");
        int inp = scan.nextInt();
        int high = inp;
        int low = inp;
        for (int i = 1; i < inpnum; i++) {
            System.out.println("Enter another number to continue.");
            inp = scan.nextInt();
            if (inp > high) {high = inp;}
            if (inp < low) {low = inp;}
        }
        System.out.println("Largest: " + high + "\n" + "Smallest: " + low + "\n");
    }

    public static void longestName(int namnum) {
        System.out.println("Please enter a name.");
        String nam = scan.nextLine();
        int namlen = nam.length();
        String longst = nam;
        for (int i = 1; i < namnum; i++) {
            System.out.println("Enter another name to continue.");
            nam = scan.nextLine();
            if (nam.length() > namlen) {longst = nam;}
        }
        System.out.println("Longest name is: " + longst);

    }

    public static void evenSumMax() {
        System.out.println("Enter how many numbers you want to input.");
        int inpnume = Math.abs(scan.nextInt());
        System.out.println("Enter a number to be compared.");
        int inp = scan.nextInt();
        int high = 0;
        int sumt = 0;
        if (inp %2 == 0) {high = inp; sumt = inp;}
        for (int i = 1; i < inpnume; i++) {
            System.out.println("Enter another number to continue.");
            inp = scan.nextInt();
            if (inp % 2 == 0) {sumt += inp; if (inp > high) { high = inp; }}
        }
        System.out.println("Largest even: " + high + "\n" + "Sum of evens: " + sumt + "\n");
    }

    public static void main(String[] args) {
        printRange(5,35);
        longestName(4);
        gradertwo();
        evenSumMax();
    }
}


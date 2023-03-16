package Uni;
import java.util.Scanner;

public class lab8 {
    static Scanner scan = new Scanner(System.in);

    public static void printPalindrome() {
    System.out.println("Enter a string.");
       String palstr = scan.nextLine();
       String palrvs = "";
       for (int i = palstr.length()-1; i >= 0; i--) {
        palrvs = palrvs + palstr.charAt(i);
       }
       if (palrvs.equalsIgnoreCase(palstr)) {
           System.out.println(palstr + " is a palindrome!");
       }
    }

    public static void doubler() {
        System.out.println("Enter a string.");
        String doubstr = scan.nextLine();
        for (int i = 0; i < doubstr.length(); i++) {
            System.out.print(doubstr.charAt(i));
            System.out.print(doubstr.charAt(i));
        } 
        System.out.println();
    }

    public static void wordCount() {
        System.out.println("Enter a string.");
        String wrd = scan.nextLine();
        int wordnum = 0;
        if (!wrd.isEmpty()) {
            if (wrd.charAt(0) != ' ') { wordnum++; }
            for (int i = 0; i < wrd.length()-1; i++) {
                    if (wrd.charAt(i) == ' ' && wrd.charAt(i+1) != ' ') {
                        wordnum++;
                    }
                }
            }
            System.out.println("Your input has " + wordnum + " words.");
        }

    public static void perfnum() {
        System.out.println("Enter a number.");
        int pnum = scan.nextInt();
        int psum = 0;
        int pcount = 0;
        for (int i = 1; i <= pnum+1; i++) {
            for (int a = 1; a <= i; a++) {
                if (i%a == 0 && a != i) { 
                    psum += a; 
                }
            }
            if (psum == i) { pcount++;  System.out.println(psum); }
            psum = 0;
        }
        System.out.println("Perfect numbers until " + pnum + ": " + pcount);
    }
public static void main(String[] args) {
    perfnum();
    printPalindrome();
    wordCount();
    doubler();
}

}

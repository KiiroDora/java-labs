package Uni;
import java.util.Scanner;

public class lab6 {
    static Scanner scan = new Scanner(System.in);

    public static void digitSum(int num) {
        int numtemp = num;
        int digit_sum = 0;
        int digit = 0;
        while(numtemp >= 0) {
            digit = numtemp%10;
            digit_sum += digit;
            numtemp = numtemp/10;
            if (numtemp < 1) {
                break;
            }
        }   
        System.out.println(digit_sum);
    }

    public static void detectdig(int num) {
        int numtemp = num;
        int digit = 0;
        int zeroco = 0;
        int evenco = 0;
        int oddco = 0;
        while(numtemp >= 0) {
            digit = numtemp%10;
            if (digit == 0) { System.out.println( digit + " --> Zero"); zeroco++; }
            if (digit%2 > 0) { System.out.println(digit + " --> Odd"); oddco++; }
            else { System.out.println(digit + " --> Even"); evenco++; }
            numtemp = numtemp/10;
            if (numtemp < 1) {
                break;
            }
        }  
        System.out.println("Results for " + num + ":\n" + zeroco + " zeros\n" + oddco + " odds\n" + evenco + " evens\n");
    }

    public static void grader() {

        int inp = scan.nextInt();
        int inpsum = 0;
        int countt = 1;
        int high = 0;
        int low = 100;
        while (inp != -1) {
            inpsum += inp;
            System.out.println("Enter another grade to continue (-1 to quit)");
            if (inp > high) {high = inp;}
            if (inp < low) {low = inp;}
            inp = scan.nextInt();
            if (inp == -1) {break;}
            countt++;
        }
        float avg = inpsum / countt;
        System.out.println("Highest score: " + high + "\n" + "Lowest score: " + low + "\n" + "Average score: " + avg);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to see its digits' sum");
        digitSum(Math.abs(scan.nextInt()));
        System.out.println("Enter a number to see its digits' being even, odd or zero");
        detectdig(scan.nextInt());
        System.out.println("Enter grades to see highest, lowest and average (-1 to quit)");
        grader();
    }
}

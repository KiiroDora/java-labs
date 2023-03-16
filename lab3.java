package Uni;

public class lab3 {
    public static void printnumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }

    public static void powerof2(int num) {
        for (int a = 0; a <= num; a++) {
            System.out.print(Math.pow(2, a) + " ");
        }
        System.out.println();
    }

    public static void powersof(int base, int poww) {
        for (int a = 0; a <= poww; a++) {
            System.out.print(Math.pow(base, a) + " ");
        }
        System.out.println();
    }

    public static void comphigh(int num1, int num2) {
        System.out.println(Math.max(num1,num2) + " is higher than " + Math.min(num1,num2));
    }

    public static void comphigh3(int num1, int num2, int num3) {
        System.out.println(Math.max(Math.max(num1,num2), num3) + " is higher than " + Math.min(Math.min(num1,num2), num3));
    }

    public static void rootfinder(double a, double b, double c) {
        System.out.println("First root is: " + (-b + Math.sqrt(b*b - 4*a*c)) / 2*a);
        System.out.println("Second root is: " + (-b - Math.sqrt(b*b - 4*a*c)) / 2*a);
    }

    public static void printsquare(int num1, int num2) {
        int m = 0;
        for (int a = 1; a <= Math.max(num1,num2) - Math.min(num1, num2) + 1; a++) {
            for (int i = num1 + m; i <= num2; i++) {
                System.out.print(i);
            }
            for (int b = 1; b <= m; b++) {
                System.out.print(num1+b-1);
            }
            m++;
            System.out.println();
        }
        System.out.println();
    }

    public static void grid(int row, int colu) {
        int a = 1 - row;
        for (int t = 1; t <= row; t++) {
            for (int i = 1; i <= colu; i++) {
                System.out.print(a + row + " ");
                a += row;
            }
            System.out.println();
            a = t+1 - row;
        }
    }

    public static void pyramid(int base) {
        int space = 7;
        for (int i = 0; i <= 7; i++) {
            for(int a = 1; a <= space; a++) {
                System.out.print("\t");
            }
            for(int b = 0; b <= i; b++) {
                System.out.print((int) Math.pow(base,b) + "\t");
            }
            for(int b = i-1; b >= 0; b--) {
                System.out.print((int) Math.pow(base,b) + "\t");
            }
            for(int a = 1; a <= space; a++) {
                System.out.print("\t");
            }
            System.out.println();
            space--;
        }
    }

    public static void main(String[] args) {
        printnumbers(15);
        powerof2(3);
        powersof(4,4);
        comphigh(1,12435);
        comphigh3(3,4,5);
        rootfinder(1,-7,12);
        printsquare(3,7);
        grid(4,6);
        pyramid(2);
    }
}

package Uni;

public class lab4 {

    public static void line1(int size) {
        for (int a = size; a >= 1; a--) {
            for (int i = 1; i <= a; i++) {
            System.out.print("_");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void line2(int size) {
        for (int a = size; a >= 0; a--) {
            for (int i = 1; i <= a; i++) {
            System.out.print("_");
            }
            for (int i = size-1; i >= a; i--) {
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void line3(int size) {
        for (int a = size; a >= 1; a--) {
            for (int i = size; i >= a; i--) {
                System.out.print("* ");
                }
            for (int i = size-1; i >= a; i--) {
                System.out.print("* ");
                }
                System.out.println();
        }
        System.out.println();
    }

    public static void line4 (int size) {
        for (int a = size; a >= 1; a--) {
            for (int i = size; i >= a; i--) {
                System.out.print(size - a + 1);
                }
            for (int i = size-1; i >= a; i--) {
                System.out.print(size - a + 1);
                }
            System.out.println();
            }
        System.out.println();
    }

    public static void line5 (int size) {
        for (int a = size; a >= 0; a--) {
            for (int i = 1; i <= a; i++) {
            System.out.print("_");
            }
            for (int i = size; i >= a; i--) {
            System.out.print("*");
            }
            for (int i = size-1; i >= a; i--) {
                System.out.print("*");
                }
            for (int i = 1; i <= a; i++) {
                System.out.print("_");
                }
            System.out.println();
        }
        System.out.println();
    }

    public static void line6 (int size) {
        for (int a = size; a >= 0; a--) {
            for (int i = 1; i <= a; i++) {
            System.out.print("_");
            }
            for (int i = size; i >= a; i--) {
            System.out.print(size - a + 1);
            }
            for (int i = size-1; i >= a; i--) {
                System.out.print(size - a + 1);
                }
            for (int i = 1; i <= a; i++) {
                System.out.print("_");
                }
            System.out.println();
        }
        System.out.println();
    }

    public static void fibo(int num) {
        int a = 1;
        int b = 1;
        int c = 1;
        if (num <= 2) {
            System.out.println(1 + "\n");
        }
        else {
            System.out.print("1 "); 
            for (int i = 1; i < num; i++) {
                System.out.print(a + " "); 
                a = b + c;
                c = b;
                b = a;
            }
        }
    }

    public static void main(String[] args) {
        line1(5);
        line2(5);
        line3(5);
        line4(5);
        line5(5);
        line6(3);
        fibo(23);
    }
     
}

package Uni;
public class notice {
    
    public static void name(int q) {
        q += 1;
        System.out.println(q);
    }

    public static void main(String[] args) {
        int x = 23;
        name(x); // passing by value results in printing 23 after printing 24 in the method
        System.out.println(x);
    }

    //this is not the case with arrays! they are passed by reference so the print will give the modified version
}

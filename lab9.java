package Uni;

import java.util.Arrays;

public class lab9 {

    public static boolean isUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array [i];
            for (int j = i+1; j < array.length; j++) {
                if (value == array[j]) {
                    System.out.println("This array is not unique.");
                    return false;
                }
            }
        }
        System.out.println("This array is unique.");
        return true;
    }

    public static boolean arrcont (int[] a1, int[] a2) {
        if (a1.equals(a2)) { System.out.println("contains"); return true; }
        for (int i = 0; i <= (a1.length-a2.length); i++) {
            int counter = 0;
            for (int j = 0; j < a2.length; j++) {
                if(a1[i+j] == a2[j]) {
                    counter++;
                }
                else {break;}
            }
            if (counter == a2.length) { System.out.println("contains"); return true;}
        }
        System.out.println("doesnt contain");
        return false;
    }

    public static void arrcolps(int[] a1) {
        int[] colpsarr = new int[a1.length/2];
        int colps = 0;
        if (a1.length%2 == 0) {
            for (int i = 0; i < a1.length; i += 2) {
                colpsarr[colps] += a1[i] + a1[i+1];
                colps++;
            }
            System.out.println(Arrays.toString(colpsarr));
        }
        else {
            int[] colpsarrr = new int[a1.length/2 + 1];
            for (int i = 0; i < a1.length-1; i += 2) {
                colpsarrr[colps] += a1[i] + a1[i+1];
                colps++;
            }
            colpsarrr[a1.length/2] = a1[a1.length-1];
            System.out.println(Arrays.toString(colpsarrr));
        }
        
    }

    public static void append (int[] a1, int[] a2) {
        int[] apparr = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) { apparr[i] = a1[i]; }
        for (int i = 0; i < a2.length; i++) { apparr[i+a1.length] = a2[i]; }
        System.out.println(Arrays.toString(apparr));
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 6, 7, 1};
        int[] brr = {6, 7, 1};
        int[] crr = {6, 7, 9};
        int[] empty = {};

        isUnique(arr);
        isUnique(brr);

        arrcont(arr, empty);
        arrcont(arr, arr);
        arrcont(arr, brr);
        arrcont(arr, crr);

        arrcolps(arr);
        arrcolps(crr);

        append(arr, crr);
    }
}

package Uni;
import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            for (int line = 1; line <= 5; line++) {
                for (int count = 1; count <= 5-line; count++) {
                    System.out.print("."); }
                System.out.print(line + "\n");
            }

            for (int line = 1; line <= 5; line++) {
                for (int count = 1; count <= 5-line; count++) {
                    System.out.print("."); }
                    for (int count = 1; count <= line; count++) {
                        System.out.print(line); }
                System.out.println();
            }

            for (int line = 1; line <= 5; line++) {
                for (int count = 1; count <= line; count++) {
                    System.out.print(line); }
                System.out.println();
            }

            for (int line = 1; line <= 5; line++) {
                for (int count = 1; count <= 5-line; count++) {
                    System.out.print("."); }
                    System.out.print(line);
                    for (int count = 1; count <= line-1; count++) {
                        System.out.print("."); }
                System.out.println();

            }
            
            System.out.println("************");
            for (int i = 1; i <= 5; i++) {
                System.out.println("*          *");
            }
            System.out.println("************");
                int size = scan.nextInt();
                while (true) {
                    if (size > 40 || size < 0) {System.out.println("number too high or low, try again"); size = scan.nextInt();}
                    else {break;}
                }

                    System.out.print("#");
                for (int i = 1; i <= size*4; i++) {
                    System.out.print("=");
                }
                System.out.print("#");
                System.out.println();

                for (int line = 1; line <= size; line++) {
                    System.out.print("|");
                    for (int a = 1; a <= 2*size - 2*line; a++) {System.out.print(" ");}
                    System.out.print("<>");
                    for (int b = 1; b <= 4*line - 4; b++) {System.out.print(".");}
                    System.out.print("<>");
                    for (int a = 1; a <= 2*size - 2*line; a++) {System.out.print(" ");}
                    System.out.print("|");
                    System.out.println();
                }

                for (int line = size; line >= 1; line--) {
                    System.out.print("|");
                    for (int a = 1; a <= 2*size - 2*line; a++) {System.out.print(" ");}
                    System.out.print("<>");
                    for (int b = 1; b <= 4*line - 4; b++) {System.out.print(".");}
                    System.out.print("<>");
                    for (int a = 1; a <= 2*size - 2*line; a++) {System.out.print(" ");}
                    System.out.print("|");
                    System.out.println();
                }
   
                System.out.print("#");
                for (int i = 1; i <= size*4; i++) {
                    System.out.print("=");
                }
        }

        System.out.print("#");
    }
}

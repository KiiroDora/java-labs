package Uni;

public class lab1 {
public static void stewup() {
    System.out.println("////////////////////");
}
public static void stewdown(int count) {
    while (count > 0) {
        System.out.println("||Victory is mine!||\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        count -= 1; 
    }
}
public static void stewie() {
    stewup();
    stewdown(5);

}
public static void eggmode(String mode) {
    switch (mode) {
        case "top":
            System.out.println("  ________\n /        \\\n/          \\");
            break;
        
        case "crack":
            System.out.println("_\"_'_\"_'_\"_");
            break;

        case "bottom":
            System.out.println("\\          /\n \\________/\n");
            break; }
} 

public static void egg() {
    eggmode("top");
    eggmode("crack");
    eggmode("bottom");
}    

public static void egg2() {
    eggmode("top");
    eggmode("bottom");
    eggmode("crack");
    eggmode("top");
    eggmode("bottom");
} 

public static void shining(int count) {
    while (count > 0) {
        System.out.println("All work and no play makes Jack a dull boy.");
        count -= 1;
    }
}

public static void main(String[] args) {
    shining(1000);
    stewie();
    egg();
    egg2();
}
}

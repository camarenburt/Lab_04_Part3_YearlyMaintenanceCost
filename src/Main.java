import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fall = 0;
        int winter = 0;
        int summer = 0;
        int spring = 0;


        System.out.println("What is the cost for maintenince in the fall: ");
        boolean nextInt = scan.hasNextInt();
        boolean nextInt1 = nextInt;
        if (nextInt1) {
            fall = scan.nextInt();
        }

        System.out.println("What is the cost for maintenince in the winter: ");
        if (nextInt1) {
            winter = scan.nextInt();
        }

        System.out.println("What is the cost for maintenince in the summer: ");
        if (nextInt1) {
            summer = scan.nextInt();
        }

        System.out.println("What is the cost for maintenince in the spring: ");
        if (nextInt1) {
            spring = scan.nextInt();
        }int annual = fall + winter + spring+ summer;
        System.out.println("Your maintenance for the year is: " +annual+".");
    }
}
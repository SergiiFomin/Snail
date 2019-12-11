import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter H");
        int height = scanner.nextInt();
        System.out.println("Enter A");
        int day = scanner.nextInt();
        System.out.println("Enter B");
        int night = scanner.nextInt();
        int result = (height - night - 1) / (day - night) + 1;
        // int result = (height - night - 1) / (day - night) + 1;
        System.out.println("You need " + result + " day(s)");
    }
}

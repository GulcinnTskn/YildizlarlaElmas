import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz (tek sayı): ");
        int n = input.nextInt();

        // Üst yarım elmas
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= (n-i)/2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt yarım elmas
        for (int i = n-2; i >= 1; i -= 2) {
            for (int j = 1; j <= (n-i)/2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

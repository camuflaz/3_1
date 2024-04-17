import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Podaj znak");
        char znak = scan.next().charAt(0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(znak + " ");
            }
            System.out.println();
        }
    }
}
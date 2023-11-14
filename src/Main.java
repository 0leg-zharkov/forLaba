import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = 0;
        int res = a + b;

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println(res);
    }
}
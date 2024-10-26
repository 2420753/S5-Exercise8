import java.util.Scanner;

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = new int[5];

        System.out.print("Enter a number: ");
        numbers[0] = stdin.nextInt();

        System.out.print("Enter a second number: ");
        numbers[1] = stdin.nextInt();

        System.out.print("Enter a third number: ");
        numbers[2] = stdin.nextInt();

        System.out.print("Enter a fourth number: ");
        numbers[3] = stdin.nextInt();

        System.out.print("Enter a fifth number: ");
        numbers[4] = stdin.nextInt();

        // checks if number is even and once found, it prints the first value. If none are dividable, then will print none found
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print("\nThis number is even: " + numbers[i]);
                break;
            } else {
                System.out.print("\nNone found! ");
                break;
            }
            //System.out.print(numbers[i] + " ");
        }
    }
}
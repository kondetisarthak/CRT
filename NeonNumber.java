import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int square = num * num;
        int sum = 0;
        for ( ; square > 0; square /= 10) {
            sum += square % 10;
        }
         if (sum == num) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }
        input.close();
    }
}

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n - 1; i >= 1; i--) {
            // Print left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
public class ButterflyPattern {
    public static void main(String args[]) {
        int n = 4;
        // Upper Part
        for (int lines = 1; lines <= n; lines++) {
            for (int stars = 1; stars <= lines; stars++) {
                System.out.print("*");
            }
            for (int spaces = n - 1; spaces >= lines; spaces--) {
                System.out.print(" ");
            }
            for (int spaces2 = n - 1; spaces2 >= lines; spaces2--) {
                System.out.print(" ");
            }
            for (int stars2 = 1; stars2 <= lines; stars2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int lines2 = 1; lines2 <= n; lines2++) {
            for (int stars3 = n; stars3 >= lines2; stars3--) {
                System.out.print("*");
            }
            for (int spaces = n - 2; spaces <= lines2; spaces++) {
                System.out.print(" ");
            }
            for (int spaces2 = 1; spaces2 < lines2; spaces2++) {
                System.out.print(" ");
            }
            for (int stars4 = n; stars4 >= lines2; stars4--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

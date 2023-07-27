public class solidRhombus {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // for (int spaces = 4; spaces >= 1; spaces--) {
            // System.out.print("$");
            // }
            for (int stars = 1; stars < i; stars++) {
                System.out.print("*");
            }
            for (int stars2 = 5; stars2 >= i; stars2--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

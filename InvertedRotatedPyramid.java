public class InvertedRotatedPyramid {
    public static void main(String args[]) {
        // int end = 4;
        // int space = end - 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

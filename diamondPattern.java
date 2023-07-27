//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

public class diamondPattern {
    public static void main(String args[]) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < (5 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int m = 1; m <= (5 - 1); m++) {
            for (int o = 1; o < m; o++) {
                System.out.print(" ");
            }
            for (int n = 4; n >= m; n--) {
                System.out.print("*");
            }
            for (int p = 4 - 1; p >= m; p--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

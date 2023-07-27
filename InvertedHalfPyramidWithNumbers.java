// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2 
// 1
public class InvertedHalfPyramidWithNumbers {
    public static void main(String args[]) {
        int n = 5;
        for (int lines = 1; lines <= n; lines++) {
            // for (int stars = n; stars >= lines; stars--) {
            // System.out.print(stars);
            // }
            for (int stars = 1; stars <= n - lines + 1; stars++) {
                System.out.print(stars);
            }
            System.out.println();
        }
    }
}

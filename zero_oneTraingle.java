// 1(1,1)
// 0(2,1) 1(2,2)
// 1(3,1) 0(3,2) 1(3,3)
// 0(4,1) 1(4,2) 0(4,3) 1(4,4)
// 1(5,1) 0(5,2) 1(5,3) 0(5,4) 1(5,5)
public class zero_oneTraingle {
    public static void main(String args[]) {
        int n = 5;
        for (int lines = 1; lines <= n; lines++) {
            for (int stars = 1; stars <= lines; stars++) {
                // System.out.print("*");
                if ((lines + stars) % 2 != 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

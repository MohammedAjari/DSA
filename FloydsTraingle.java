// 1
// 2 3
// 4 5 6  
// 7 8 9 10
// 11 12 13 14 15

public class FloydsTraingle {
    public static void main(String args[]) {
        int n = 5;
        int num = 1;
        for (int lines = 1; lines <= n; lines++) {
            for (int stars = 1; stars <= lines; stars++) {
                // System.out.print("*");
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}

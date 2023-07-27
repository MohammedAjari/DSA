public class HallowRectangle {
    public static void main(String args[]) {
        for (int line = 1; line <= 4; line++) {
            for (int star = 5; star >= 1; star--) {
                // System.out.print("*");
                if (line == 1 || line == 4 || star == 1 || star == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

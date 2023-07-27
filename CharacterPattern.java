public class CharacterPattern {
    public static void main(String args[]) {
        // String arr[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
        // "M", "N", "O" };
        char ch = 'A';
        // int cnt = 0;
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                // System.out.print("*");
                System.out.print(ch);
                ch++;
                // System.out.print(arr[cnt]);
                // cnt++;
            }
            System.out.println();
        }
    }
}

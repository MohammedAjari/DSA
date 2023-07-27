// package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 6, 7, 8, 9 };
        reverseArray(numbers);
        for (var num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int numbers[]) {
        int start = 0, last = numbers.length - 1;
        while (start < last) {
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;

            start++;
            last--;
        }
    }
}

// package Arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 6, 7, 8, 9 };
        int LargestNumber = findLargest(numbers);
        System.out.println("Largest Number is " + LargestNumber);
    }

    public static int findLargest(int numbers[]) {
        // Integer.MIN_VALUE = Most lowest possible integer value
        int largestNumber = Integer.MIN_VALUE;
        for (var num : numbers) {
            if (num > largestNumber) {
                largestNumber = num;
            }
        }
        return largestNumber;
    }
}

// package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 6, 7, 8, 9, 19 };
        int key = 10;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at place " + linearSearch(numbers, key));
        }
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

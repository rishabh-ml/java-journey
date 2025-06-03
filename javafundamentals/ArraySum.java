package javafundamentals;

public class ArraySum {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20};
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        System.out.println("Total sum: " +sum);
    }
}

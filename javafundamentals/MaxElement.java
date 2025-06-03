package javafundamentals;

public class MaxElement {
    public static void main(String[] args) {
        int[] nums = {3, 9, 7, 12, 5};
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

        }

        System.out.println("Max Element: " + max);
    }
}

package javafundamentals;

public class MinElement {
    public static void main(String[] args) {
        int[] nums = {3, 9, 7, 12, 5};
        int min = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <min){
                min = nums[i];
            }
        }

        System.out.println("Min Element: "+min);
    }
}

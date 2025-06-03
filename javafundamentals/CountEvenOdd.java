package javafundamentals;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] nums = {4, 7, 9, 2, 10, 3};
        int even = 0, odd = 0;

        for(int num : nums){
            if(num%2==0) {
                even++;
            } else {
                odd ++;
            }
        }

        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}

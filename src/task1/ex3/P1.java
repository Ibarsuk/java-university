package task1.ex3;

public class P1 {
    public static void main(String[] args) {
        int[] nums = {4, 6, 8, 12, 56, 5523, 742,4, 2};

        int summ = 0;

        for (int num : nums) {
            summ += num;
        }

        System.out.println("for: " + summ);
        summ = 0;

        int i = 0;
        int numsArrayLength = nums.length;
        while (i < numsArrayLength) {
            summ += nums[i];
            i++;
        }

        System.out.println("\nwhile: " + summ);
        summ = 0;

        int j = 0;
        do {
            summ += nums[j];
            j++;
        } while (j < numsArrayLength);

        System.out.println("\ndo while: " + summ);
    }
}
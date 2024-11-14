package assignment7;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        while (k>0) {
            int[] temp = new int[nums.length];
            temp[0] = nums[nums.length - 1];
            for (int i = 0; i < nums.length - 1; i++) {
                temp[i + 1] = nums[i];
            }
            for (int i = 0; i < temp.length; i++) {
                nums[i] = temp[i];
            }
            k--;
        }
    }
}

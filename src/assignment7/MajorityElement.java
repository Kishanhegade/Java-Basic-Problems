package assignment7;

public class MajorityElement {


    public  int majorityElement(int[] nums)
    {
        int me = nums[0];
        int n= nums.length-1;

        for (int i = 0; i <=n; i++)
        {
            int count=1;
            for (int j = i+1; j <=n; j++)
            {
                if(nums[i]== nums[j]){
                    count++;
                    nums[j]= nums[n];
                    n--;
                    j--;
                }
            }
            if(count>nums.length/2)
                return nums[i];
        }
        return 0;
    }
}

package assignment7;

public class MoveZeroes {
    public void moveZeroes(int[] n) {
        int [] temp = new int[n.length];
        int j=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=0)
            {
                temp[j++]=n[i];

            }
        }

        for (int i = 0; i < temp.length; i++) {
            n[i]=temp[i];
        }



//                int snowBallSize = 0;
//                for (int i=0;i<nums.length;i++){
//                    if (nums[i]==0){
//                        snowBallSize++;
//                    }
//                    else if (snowBallSize > 0) {
//                        int t = nums[i];
//                        nums[i]=0;
//                        nums[i-snowBallSize]=t;
//                    }
//                }

    }
}

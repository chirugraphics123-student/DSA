package Arrays;

public class Sliding_Window_1 {
    public static int findMax(int nums[],int k){
        int winsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            winsum+=nums[i];
        }
        maxsum=winsum;
        for(int i=k;i<nums.length;i++){
            winsum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum, winsum);
        }
        return maxsum;

    }
       
    public static void main(String[] args) {
        int nums[]={2,4,1,6,5};
        System.out.println(findMax(nums,2));
    }
}

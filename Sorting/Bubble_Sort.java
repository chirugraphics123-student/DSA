import java.util.Arrays;

class Bubble_Sort{
    static void sort(int nums[]){
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={23,12,56,34,2,8};
         System.out.println("Initial: "+Arrays.toString(nums));
        sort(nums);
        System.out.println("After sorting: "+Arrays.toString(nums));
    }
}
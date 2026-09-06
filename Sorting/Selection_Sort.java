import java.util.Arrays;

class Selection_Sort{
    static void sort(int nums[]){
        int min=0;
        for(int i=0;i<nums.length;i++){
            min=nums[i];
            for(int j=i;j<nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={2,1,45,23,5,7};
        System.out.println("Initial: "+Arrays.toString(nums));
        sort(nums);
        System.out.println("After sorting: "+Arrays.toString(nums));
    }
}
import java.util.Arrays;

public class Insertion_Sort {
    static void sort(int nums[]){
        for(int i=0;i<nums.length;i++){
            int j=i;
            while(j>0 && nums[j]<nums[j-1]){
                int t=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=t;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={23,12,56,3,98,5,1};
        System.out.println("Initial: "+Arrays.toString(nums));
        sort(nums);
        System.out.println("After sorting: "+Arrays.toString(nums));
    }
}

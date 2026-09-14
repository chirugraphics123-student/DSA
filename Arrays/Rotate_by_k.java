package Arrays;
import java.util.Arrays;
public class Rotate_by_k {
    public static void rotate(int nums[],int k){
        if (nums.length<=0){
            System.out.println("Invalid Array!!");
            System.exit(1);
        }
        for(int i=1;i<=k;i++){
            int t=nums[0];
            for(int j=1;j<nums.length;j++){
                nums[j-1]=nums[j];
            }
            nums[nums.length-1]=t;
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        rotate(nums, 4);
        System.out.println(Arrays.toString(nums));
    }
}

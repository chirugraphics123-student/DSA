package Arrays;
import java.util.Arrays;

public class left_rotate_by_1 {
    public static void rotate(int nums[]){
        int t=nums[0];
        for(int i=1;i<nums.length;i++){
                nums[i-1]=nums[i];
        }
        nums[nums.length-1]=t;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        rotate(nums);
    }
}


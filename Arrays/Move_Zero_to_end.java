package Arrays;
import java.util.Arrays;

public class Move_Zero_to_end {
    public static void move_zero(int nums[]){
        int p2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int t=nums[i];
                nums[i]=nums[p2];
                nums[p2]=t;
                p2++;
            }
        }

    }
    public static void main(String[] args) {
        int nums[]={0,1,0,4,7,8};
        move_zero(nums);
        System.out.println(Arrays.toString(nums));
    }
}

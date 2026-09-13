package Arrays;
import java.util.Arrays;

public class Remove_duplicates{
    public static int removedup(int nums[]){
        int unique=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[unique]=nums[i];
                unique++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return unique;

    }   
    public static void main(String args[]){
        int nums[]={0,0,3,3,5,6};
        System.out.println(removedup(nums));
    }
}
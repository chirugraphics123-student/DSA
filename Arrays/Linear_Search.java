package Arrays;

public class Linear_Search {
    public static int linearSearch(int nums[], int target) {
		for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        System.out.println(linearSearch(nums, 2));
    }
}

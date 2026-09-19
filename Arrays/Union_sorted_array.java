package Arrays;
import java.util.*;
public class  Union_sorted_array {
    public static int[] union(int []nums1,int[] nums2){
        List<Integer> result = new ArrayList<>();
    int p1 = 0, p2 = 0;
    
    // Helper function to add elements only if they aren't duplicates of the last added element
    while (p1 < nums1.length && p2 < nums2.length) {
        int val;
        if (nums1[p1] < nums2[p2]) {
            val = nums1[p1++];
        } else if (nums1[p1] > nums2[p2]) {
            val = nums2[p2++];
        } else {
            val = nums1[p1];
            p1++;
            p2++;
        }
        
        // Add to result only if it's unique
        if (result.isEmpty() || result.get(result.size() - 1) != val) {
            result.add(val);
        }
    }
    
    // Process remaining elements in nums1
    while (p1 < nums1.length) {
        int val = nums1[p1++];
        if (result.isEmpty() || result.get(result.size() - 1) != val) {
            result.add(val);
        }
    }
    
    // Process remaining elements in nums2
    while (p2 < nums2.length) {
        int val = nums2[p2++];
        if (result.isEmpty() || result.get(result.size() - 1) != val) {
            result.add(val);
        }
    }
    
    // Convert the List back to an int array
    return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int [] nums1={1,2,3,4};
        int [] nums2={2,3,4,5,6,7};
        int [] new_arr=union(nums1,nums2);
        System.out.println(Arrays.toString(new_arr));

    }
}

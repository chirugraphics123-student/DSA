import java.util.ArrayList;
import java.util.List;

public class Merge_Sort {
    static  void merge(ArrayList<Integer> l,int low,int mid,int high){
        ArrayList<Integer> t=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(l.get(left)<l.get(right)){
                t.add(l.get(left));
                left++;

            }
            else{
                t.add(l.get(right));
                right++;
            }
        }
        while(left<=mid){
            t.add(l.get(left));
                left++;
        }
        while (right<=high) {
            t.add(l.get(right));
                right++;
        }
        for(int i=0;i<t.size();i++){
            l.set(i+low,t.get(i));
        }
    }
    static void sort(ArrayList<Integer> l,int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        sort(l,low,mid);
        sort(l,mid+1,high);
        merge(l, low, mid, high);

    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(List.of(12,4,23,1,78,53));
        System.out.println("Before: "+nums);
        sort(nums, 0, nums.size()-1);
        System.out.println("After Sorting: "+nums);
    }
}

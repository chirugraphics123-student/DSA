package Arrays;

public class Second_largest_element {
    static int second_largest_element(int []arr){
        int max=0;
        int second_max=-1;//Returns -1 if the array has same elements
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        for(int i:arr){
            if(i>second_max && i!=max){
                second_max=i;
            }
        }
        return second_max;
    }
    public static void main(String[] args) {
        int arr[]={23,14,23,78,12,90,77};
        System.out.println(second_largest_element(arr));
    }
}

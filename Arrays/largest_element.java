package Arrays;
public class largest_element {
    static int largest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={12,45,23,99,1,5};
        System.out.println("Largest Elememt: "+largest(arr));
        
    }
}

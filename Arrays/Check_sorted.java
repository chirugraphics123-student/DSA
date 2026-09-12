package Arrays;

public class Check_sorted {
    public static void main(String[] args) {
        boolean sorted=false;
        int arr[]={1,2,4,3,5};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
            sorted=true;
        }
        System.out.println("Sorted: "+sorted);
    }
}

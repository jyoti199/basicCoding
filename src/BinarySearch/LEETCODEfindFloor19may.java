package BinarySearch;
import java.util.*;
public class LEETCODEfindFloor19may {
    public static void main(String[] args){
        //find floor of given no.
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }System.out.println(Arrays.toString(arr));
        int floorOf=in.nextInt();
        int start=0;
        int end=arr.length-1;
        int ans = Integer.MIN_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>ans && arr[mid]<=floorOf){
                ans=arr[mid];
                start=mid+1;
            }else{
                end=mid-1;
            }
        }System.out.println(ans);
    }

}

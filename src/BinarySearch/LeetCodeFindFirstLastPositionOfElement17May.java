package BinarySearch;
import java.util.*;
public class LeetCodeFindFirstLastPositionOfElement17May {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] nums={5,7,7,8,8,10};
        for(int i=0;i<nums.length;i++){
        }System.out.println(Arrays.toString(nums));
        int target=8;
        int[] ans=binary(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binary(int a[],int t){
        int start=0;
        int end=a.length-1;
        int first=-1;
        int last=-1;
        //first position
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==t){
                first=mid;
                end=mid-1;
            }
            else if(a[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        //last position
        start=0;
        end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==t){
                last=mid;
                start=mid+1;
            }
            else if(a[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return new int[]{first, last};
    }
}

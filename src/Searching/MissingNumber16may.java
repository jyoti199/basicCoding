package Searching;
import java.util.*;
public class MissingNumber16may {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=5;
        int[] arr={1,2,3,5};
        int sum=0;
        for(int i=0;i<4;i++){
            sum+=arr[i];
        }
        int ans=n*(n+1)/2;
        System.out.println(ans-sum);
    }
}

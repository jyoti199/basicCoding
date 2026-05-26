package ArrayMarch;
import java.util.Scanner;
import java.util.Arrays;
public class MergeTwoArrays {
    public static void main(String[] args){
        //15. Merge two arrays
        //Write a program to combine two arrays into one array.
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        int[] merg=new int[n1+n2];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr2.length;i++){
            arr2[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        //merge arr1 and arr2
        for(int i=0;i<arr1.length;i++){
            merg[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merg[arr1.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(merg));
    }
}

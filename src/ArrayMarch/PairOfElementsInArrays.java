package ArrayMarch;
import java.util.Scanner;
import java.util.Arrays;
public class PairOfElementsInArrays {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr)); //[1,2,3,4,5,6]=> (1,2)(1,3)(1,4)(1,5)(1,6)
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                int num=arr[j];
                System.out.print("("+curr +","+num+"),");
            }
            System.out.println();
        }
    }
}

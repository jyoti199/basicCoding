package Recursion;
import java.util.*;
public class PowerOf2may25 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int base=in.nextInt();
        if(n<0){
            System.out.println("invalid");
        }
        int ans=power(n,base);
        System.out.println(ans);
    }
    static int power(int n,int base){
        if(n==0){
            return 1;
        }
        return base*power(n-1,base);
    }
}

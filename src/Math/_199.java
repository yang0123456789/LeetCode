package Math;

import java.util.Scanner;

public class _199 {
    public static int sum(int n,int k){
        int res=0;
        for (int i=1;i<=n;i++) {
            res+=k%i;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        System.out.println(sum(n,k));
    }
}

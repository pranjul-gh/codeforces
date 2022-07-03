import java.util.Scanner;
import java.lang.Math;
public class CF1409A {
    public static void main(String pran[]){
    Scanner sc = new Scanner(System.in);
        int t,i;
        t=sc.nextInt();
        int arr[] = new int[t];
        for (i=0; i<t; i++){
            int a = sc.nextInt();
            int b =sc.nextInt();
            int y = Math.abs(b-a);
           // System.out.println(y);
           if(y==0){
            arr[i]=0;        }
           else if (y>9){
                int z=(y/10);
           // System.out.println(z);
            if (z%10!=0){
                z+=1;
                arr[i] = z;            }
            else {
                arr[i] = z; }}
            
            else{
                arr[i]=1;            }
        }

        for (int j=0; j<t; j++){
            System.out.println(arr[j]);        }
sc.close();    }
}

/*
import java.util.Scanner;
import java.lang.Math;
public class CF1409A {
    public static void main(String pran[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr= new int[n];
    for(int i = 0; i<n; i++)    {
        int k,a,m,x,sum=0;
        k=sc.nextInt();
        a=sc.nextInt();
        m=Math.abs(k-a);
        for(int j=10; j>0; j--)    {
            if(m>=j)            {
                x=m/j;
                sum+=x;
                m=m%j;            }
    }
    arr[i]=sum;
    }
    for (int j=0; j<n; j++){
         System.out.println(arr[j]);        }
}}
 */
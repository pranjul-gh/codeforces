//test 1
import java.util.*;
public class CF1399B {
public static void main (String pran []){
    Scanner sc = new Scanner(System.in);
    int t,n, i,j,l,m, J;
    t=sc.nextInt();
    n=sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int arr1[] = a;
    int arr2[] = b;
    for (i=0;i<t;i++){
        int p=0,q=0,r=0;
        for (j=0;j<n;j++){
            a[j]=sc.nextInt();        }
        for (J=0;J<n;J++){
            b[J]=sc.nextInt();        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int min1=arr1[0];
        int min2=arr2[0];
        for (m=0;m<n;m++){
            for(l=0;l<n;l++){
            if (a[l]>min1 && b[l]>min2){
                a[l]=a[l]-1;
                b[l]=b[l]-1;
                p+=1;        }
            if(a[l]>min1 && b[l]==min2){
                a[l]=min1;
                int xx=a[l]-min1;  
                q=xx+q;
                continue;          }
            if(a[l]==min1 && b[l]>min2){
                b[l]=min2;
                int xy=b[l]-min2;
                r=xy+r; 
                continue;           }
        }    } 
    System.out.println(p+q+r);
    }
}    
}

// #_wrong_solution
import java.util.*;
public class CF469A {
    public static void main(String argds[]){
    Scanner sc = new Scanner(System.in);
    int p,q,i,j,k,l,m,f=0 ;
    int n = sc.nextInt();
    p = sc.nextInt();
    int[] arr1 = new int[p];
    for (i=0; i<p; i++){
        arr1[i] = sc.nextInt();
        }
    q = sc.nextInt();
    int[] arr2 = new int[q];
    for (j=0; j<q; j++){
        arr2[j] = sc.nextInt();
        }
    int[] comarr = new int[p+q];
    for (k=0;k<(p+q);){
        for (l=0; l<p; l++){
            comarr[k] = arr1[l];
            k++;
        }
        for (m=0; m<q; m++){
            comarr[k] = arr2[m];
        }
    }
    for (i=1; i<n;i++){
        for (int h=0; h<comarr.length;h++){
       // System.out.println(comarr[h]);
       if (comarr[h] == i){
        f++;
        break; }
       }
    }
    
    if(f==n){
        System.out.println("I become the guy.");
            }
    else {
    System.out.println("Oh, my keyboard!");
    }
sc.close(); }
}
/*
import java.util.*;
public class CF1624 {
    public static void main(String pran[]){
        Scanner sc = new Scanner(System.in);
        int t,k,i,j,n,max,min;
        t=sc.nextInt();
        for (i=0; i<t; i++){
            n=sc.nextInt();
            int[] arr = new int[n];
            for (j=0; j<n; j++){
                arr[j] = sc.nextInt();            
            
                // max=arr[0];
                // if(max>arr[j]){
                //     max=arr[j];                }                
                }
               // max = Arrays.stream(arr).max().getAsInt();
               // System.out.println(max);
            Arrays.sort(arr);
            min=arr[0];
            max=arr[n-1];

            // min=arr[0];
            // for (i=0;i<n;i++){
            //     if(min>=arr[j]){
            //         min=arr[j];                }
            // }
        System.out.println(max-min);     
        }
        
    }    
}
*/


import java.util.*;
public class CF1624 {
    public static void main(String pran[]){
        Scanner sc = new Scanner(System.in);
        int t,k,i,j,n,max,min;
        t=sc.nextInt();
        for (i=0; i<t; i++){
            n=sc.nextInt();
            String ar=sc.nextLine();
            String[] arr1=ar.split(" ");
            // Arrays.sort(arr1);
            // int l=arr1.length;
            // max=Integer.parseInt(arr1[l-1]);
            // min=Integer.parseInt(arr1[0]);
            System.out.println("array:"+arr1);
    //        System.out.println(max-min);

            
}}}
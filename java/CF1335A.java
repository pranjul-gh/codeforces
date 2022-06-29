// import java.util.Scanner;
// public class CF1335A {
//     public static void main(String pran[]){
//     Scanner sc = new Scanner(System.in);
//         int t,i,j,k=0,n;
//         t=sc.nextInt();
//         int arr[] = new int[t];
//         for (j=0; j<t; j++){
//             n=sc.nextInt();
//             for (i=n; i>=1; i--){
//                 int a=i;
//                 int b=n-a;
//                 if (a>b){
//                     k+=1;         }   
//                 if (a<b){
//                     break;           } 
//                                }
//         arr[j] = k;
//                             }
//     for (i=0; i<arr.length; i++){
//         System.out.println(arr[i]);    }
//     }
// }


import java.util.Scanner;
public class CF1335A {
    public static void main(String pran[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int j=0; j<t; j++){
        int n = sc.nextInt();
        int g = n/2;
        g+=1;
        //int h = n-g;
    System.out.println(n-g);    }
sc.close(); }
}
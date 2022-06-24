///bhut hi chhutiya code :|
// import java.util.Scanner;

// public class CF155A {
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n,x,i,j,count=0;
//     n = sc.nextInt();
//     int[] arr = new int[n];
//     for (i=0; i<n;i++){
//         arr[i] = sc.nextInt();   }
//     x=arr[0];
//     for (j=1; j<n;j++){
//         if (arr[j]>x){
//             count+=1;  }
//         else {
//             continue;    }    }
//     System.out.println(count);  
//     sc.close();   }
// }


import java.util.Scanner;

public class CF155A {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,i,j,count=0,x=0,y=0,count2=0;
    n = sc.nextInt();
    int[] arr = new int[n];
    for (i=0; i<n;i++){
        arr[i] = sc.nextInt();   }
    for (j=1; j<n;j++){
        if (arr[j] > arr[x]){
            x=j;
            count+=1;       }
        if (arr[j] < arr[y]){
            y=j;
            count2 += 1;        }
        }
    int a = ((count+count2)>count)?count+count2:count;
    System.out.println(a);
sc.close();       
    }
}
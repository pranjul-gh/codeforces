//@atyadav 37 helped
import java.util.Scanner;
public class CF344A {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int res=1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();  }
        for(int i=1; i<n; i++){
            if(arr[i]!=arr[(i-1)]){
            res+=1;
                    }
    }
    System.out.println(res);
    sc.close();
    } 
}
// import java.util.Scanner;
// public class CF344A {
//     public static void main(String[] argf){
//     Scanner sc = new Scanner(System.in);
//     int i,n,sum=1;
//  //   String s;
//     n=sc.nextInt();
//     int[] arr = new int[n];
//     for(i=0;i<n;i++){
        
//        arr[i]=sc.nextInt();   }
//     for(int j=1;j<n;j++){
//         // if (arr[j]==arr[(j-1)]){ 
//         //     continue;       }
//         if (arr[j] != arr[(j-1)]) {
//             sum+=1;            }
//         //else {sum+=1;}
//     }
//     System.out.println(sum);
// sc.close();
//     }
// }

//---------------------++++++++++++++++++++-----------//

// import java.util.Scanner;
// public class CF344A {
//     public static void main(String[] argf){
//     Scanner sc = new Scanner(System.in);
//     int i,n,sum=1;
//     n=sc.nextInt();
//   //  int[] arr = new int[n];
//     String[] arr = new String[n];
//     for(i=0;i<n;i++){
//     //   arr[i]=sc.nextInt();   } 
//         arr[i] = sc.next();  }
//     for(int j=1;j<n-1;j++){
//         // if (arr[j]==arr[(j-1)]){ 
//         //     continue;       }
//         if (arr[j] != arr[(j+1)]) {
//             sum+=1;            }
//         }
//     System.out.println(sum);
// sc.close();
//     }
// }

// import java.util.Scanner;
// public class another_practice_test {

//     public static void main (String pran[]){
//         Scanner sc = new Scanner(System.in);
//         int  i,n,m,x;
//         x = sc.nextInt();
//         n=x/2;
//         m=x-n;
//         int n1=0,m1=0;
//         for (i=2;i<m;i++){
//             n=x/2;
//             m=x-n;
//             if (n%i==0 && m%i==0){
//                 n1=n;
//                 m1=m;
//                 System.out.println(n+" "+m);
//                 break;        }
//             else{
//                 n=n-1;
//                 m=m+1;   
//                 continue;    }
        
//         }
        
    
        
//     }
// }  

/*----------------------------------------------- */

// // import java.util.Scanner;
// // public class another_practice_test {

// //     public static void main (String pran[]){
// //         Scanner sc = new Scanner(System.in);
// //         int  i,n,m,x;
// //         x = sc.nextInt();
// //         n=x/2;
// //         m=x-n;
// //         int m1=m;
// //         int n1=n;
// //         for (i=0;i<m;i++){
// //             n1+=1;
// //                 m1-=1;
// //             if (n1%2!=0   &&  m1%3!=0){
// //                 continue;
// //             }
// //             else{
// //                // System.out.println(n1+" "+m1);
// //                 break;            }
                
        

// //     }
// //     System.out.println(n1+" "+m1);}
// // }        

/*--------------------------------------------- */

import java.util.Scanner;
public class another_practice_test {

    public static void main (String pran[]){
        Scanner sc = new Scanner(System.in);
        int  i,n,m,x;
        x = sc.nextInt();
        n=x/2;
        m=x-n;
        if (x%2==0){
            System.out.println(n+" "+n);        }
        else{
            i=x-9;
            System.out.println("9"+" "+i);        }
    }
}
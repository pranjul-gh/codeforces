//@atyadav37 helped

import java.util.Scanner;
public class CF427A{
    public static void main(String[] pran){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    int x=0, y=0, p, m;
    for(int i=0; i<n; i++){
        m=0;
        p=sc.nextInt();
        if(p>0){
            x+=p;  }
        if(p<0){
            m=x-1; 
        if(x>0){
            x-=1;  }
        if(m<0){
            y+=1;  }
                      }
                            }
    System.out.println(y);
    }
}  


// import java.util.Scanner;
// public class CF427A {
//     public static void main(String pran[]){
//     Scanner sc = new Scanner(System.in);
//     int i,n,m=0;
//     n=sc.nextInt();
//     int arr[]=new int[n];
    
//     for (i=0;i<n; i++){
//         arr[i] = sc.nextInt();    }

//     for (i=1; i<=n;i++){
//         if(arr[i-1]<0 && i!=n){
//             m+=1;        }

//         if(arr[i-1] > 0 && i!=n){
//             arr[i] = arr[i-1]+arr[i];        }

//         if(i == n && arr[i-1]<0){
//                 m+=1;            }        
//         }
//     System.out.println(m);
// sc.close();        }
//     }    

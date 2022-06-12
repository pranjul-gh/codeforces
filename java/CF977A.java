import java.util.*;

// public class CF977A {
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     String s = Integer.toString(a);
//     int l = s.length(); 
//     char[] arr = new char[l];
//    // int gg = 0;
//     for (int i=0; i<l; i++){
//         arr[i] = s.charAt(i) ; }
    
//     for (int j=0; j<b; j++)   {
//         if (arr[l-1] != '0'){
//             a = a-1;   }
//         else {
//             a=a/10;
//             continue;   }
//                               }
//     System.out.println(a);
//     sc.close();
//     } 
// }
    

public class CF977A{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        for(int n=m; n>=1; n--){
            if (k%10 == 0){
                k/=10;
                       }
        else {
            k-=1;
        }}
    System.out.println(k);   
sc.close();
}
}


    


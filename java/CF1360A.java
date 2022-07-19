import java.util.Scanner;
public class CF1360A{
    public static void main(String pran[]){
    Scanner sc = new Scanner(System.in);
        int t,i, a,b,l,k1,k2;
        t=sc.nextInt();
        for (i=0; i<t; i++){
            a=sc.nextInt();
            b=sc.nextInt();
            
            k1=(a<=b)? a:b ;
            l=k1+k1 ;   //s1
            k2=(a>=b)? a:b ;

            int k3=(l>k2)? (l*l):(k2*k2);
            System.out.println(k3);

        //    if (l>k2){
        //     // j=l-k2 ;
        //     // h=j+k2 ;     //s2
        //     System.out.println(l*l);  }
        //     else {
        //         System.out.println(k2*k2);            }

        }
    }
}
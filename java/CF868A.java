
import java.util.Scanner;
public class CF868A{
    public static void main(String pran[]){
        Scanner sc = new Scanner(System.in);
        String str0,x0;
        str0=sc.next();
        int t=sc.nextInt();
        int Flag1=0;
        int Flag2=0;
        int xflag=0;
        char[] str00 = str0.toCharArray();
        
        for (int i=1; i<=t; i++){
            x0=sc.next();
            char[] x = x0.toCharArray();
            if (str0==x0){
                xflag=2;
                break;            }
            if (str00[0]==x[1]){
                Flag1=1;            }
            if (str00[1]==x[0]){
                Flag2=1;            }
                
        }
    if (Flag1+Flag2>1){
        System.out.println("YES");    }
    if (xflag==2){
        System.out.println("YES");    }
    else{ System.out.println("NO");   }
    }
}

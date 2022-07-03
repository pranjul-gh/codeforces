import java.util.Scanner;
import java.lang.Math;
public class CF581A {
    public static void main(String pran[]){
    Scanner sc = new Scanner(System.in);
        int a,b,min,n;
        a=sc.nextInt();
        b=sc.nextInt();
        min = (a<b)?a:b;
        n=Math.abs(a-b);
        System.out.println(min) ;   
        System.out.println(n/2)   ;     
sc.close();    }    
}

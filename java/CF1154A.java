import java.util.Scanner;

public class CF1154A {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a,b,c,d, H1,H2, m,n,p,q;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();

    H1 = (a>b)?a:b;
    H2 = (c>d)?c:d;
    int mxm = (H1>H2)?H1:H2;

    m = mxm-a;
    n = mxm-b;
    p = mxm-c;
    q = mxm-d;
    if (m!=0){
        System.out.print(m+" ");  }
    if (n!=0){
        System.out.print(n+" ");  }
    if (p!=0){
        System.out.print(p+" ");  }
    if (q!=0){
        System.out.print(q+" ");  }
sc.close();    }    
}

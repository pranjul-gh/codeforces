import java.util.Scanner;
public class CF1472 {
    public static void main(String pran[]){
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int nf=1, nk=0;
            int w=sc.nextInt();
            int h=sc.nextInt();
            int n=sc.nextInt();
            //trash
          /*  for(int k=0; k<n; k++){
                if (w%2==0){
                    nf+=2;
                    w=w/2;          }
                else if (h%2==0){
                    nf+=2;
                    w=w/2;                }
                else{nk=1;}
            }
           int nf=1;   */

           while (w%2==0){
                w/=2;
                nf*=2;                            }
            while (h%2==0){
                h/=2;
            nf*=2;            }
        String p=(nf+nk>=n)? "YES":"NO";
        System.out.println(p);
    }
    }
}

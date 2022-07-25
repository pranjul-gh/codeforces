//========time limit exceeded======

import java.util.*;
public class CF1303A {
    public static void main(String pran[]){
        Scanner sc = new Scanner(System.in);
        int a,n,sum=0;
        int nn = sc.nextInt();
        for (int j=0; j<nn; j++){
        int x=sc.nextInt();
        //System.out.println(x);
        n=x;
        sum=x;
        while(n%10==0){
          sum/=10;
          a=sum;
            n/=10;
        }
    String st=Integer.toString(n);
//System.out.println(st);
    int count=0;
    char[] stch=st.toCharArray();
    for(a=0; a<stch.length; a++){
        if( stch[a]=='0'){
            count+=1;        }
         }
System.out.println(count);
    
        }    }   
}

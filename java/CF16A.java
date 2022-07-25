//===============needs to be completed========


import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF16A {           //--------------::: class name:::-------//
 
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
/*-----------------------------FastReader block ends here---------------------*/
    
    
    
    public static void main(String testFR[]){
        FastReader fr = new FastReader();        
        int n,m,i,j,flag1=0,flag2=0;
        n=fr.nextInt();
        m=fr.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            String q = fr.nextLine();   
            arr[i]=Integer.parseInt(q); 
            String s=Integer.toString(arr[i]);
             if (s.length()!=q.length() && arr[i]!=0){
                 flag1=96;   }
            }
        for (j=0;j<n-2;j++){
            if (arr[j]!=arr[j+1] && arr[j+1]!=arr[j+2] ){
                flag2=69;            }
            // if(arr[j+1]%111!=0 || arr[j]%111!=0 || arr[j+2]%111!=0){
            //     flag1=96;
            // }
            else{flag1=33;}
        }
        String p = (flag2>flag1)? "YES" : "NO";
        
        System.out.println(p);
  }
}   

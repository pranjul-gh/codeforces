import java.util.Arrays;
import java.util.Scanner;
public class CF141A {
    public static void main(String pran[]){
        Scanner sc = new Scanner(System.in);
        String s,s1,s2,sM;
        int cn=0;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        sM = sc.nextLine();
        s=s1+s2;
        int n = s.length();
        int nn = sM.length();
        char[] arr1 = new char[n];
        char[] arr2 = new char[nn];
       // String prn = ()
        
       for (int i=0; i<n; i++){
            arr1[i] = s.charAt(i);
            arr2[i] = sM.charAt(i);        }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        for( int j=0; j<n; j++){
            if (arr1[j] == arr2[j]){
                cn+=1;            }
            else {
                continue;            }  
                              }
       if (n==(cn)){
        System.out.println("YES");}
       else{
        System.out.println("NO");       }    
   sc.close(); }
}

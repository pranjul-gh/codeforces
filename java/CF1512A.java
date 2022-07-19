import java.util.*;
public class CF1512A {
    public static void main (String pran[]){
    Scanner sc = new Scanner(System.in);
    int n,t,m1;
        t=sc.nextInt();
        for (int i=0; i<t; i++){
            n=sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            for (int j=0; j<n; j++){
                int q=sc.nextInt();
                arr1[j]=q;
                arr2[j]=q;            }
            Arrays.sort(arr1);
            m1= (arr1[0]==arr1[1])?arr1[n-1]:arr1[0];
            //int idx = arr2.indexOf(m1);
            for (int k=0; k<n; k++){
                if(arr2[k]==m1){
                    System.out.println(k+1);                }
            }
        }
sc.close();
    }
}

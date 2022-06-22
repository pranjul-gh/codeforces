// wrong code....
import java.util.Scanner;
public class CF1328A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        int[] arr = new int[n*2];
        for (int i=0;i<(n*2);i++){
            arr[i] = sc.nextInt(); }

        for (int k=0;k<n;k+=2){
            if (arr[k] > arr[k+1] && arr[k]%arr[k+1] != 0){
               r = arr[k]%arr[k+1];
               System.out.println(arr[k]-r);            }
            if (arr[k] < arr[k+1]){
                System.out.println(arr[k+1]-arr[k]);  }
                //continue;
            if (arr[k]%arr[k+1] == 0){
                System.out.println(0);
                                       }
                                }
sc.close();    }
}

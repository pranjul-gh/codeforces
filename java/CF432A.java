import java.util.Scanner;
public class CF432A {
    public static void main(String pran[]){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int k = sc.nextInt();
        // int arr[] = new int[n];
        for (int i =0; i<n; i++){
            int m = sc.nextInt();
            if (m+k <= 5){
                //arr[i]=m;     
                count+=1;       }
            else {continue;}
        }
    System.out.println(count/3);
  sc.close();  }
    
}

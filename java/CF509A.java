import java.util.Scanner;
public class CF509A{
    public static void main(String[] pran ){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,j,b=0;
    int arr[][] = new int[n][n];
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            if(i==0 || j==0){
                arr[i][j]=1;            }
            else {
                arr[i][j] = arr[i-1][j]+arr[i][j-1];            }
            if (i==n-1 && j==n-1){
               b = arr[i][j];            }
        }
    }   
System.out.println(b);
    }
}
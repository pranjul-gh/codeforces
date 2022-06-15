import java.util.Scanner;

public class CF467A {
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
        int count=0;
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int cap = q-p;
            if (cap>0){
                count+=1;
                continue;  }
            else{
                continue;  }
        }
    System.out.println(count);
    sc.close();
    
    }    
}

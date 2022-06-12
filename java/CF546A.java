import java.util.Scanner;

public class CF546A {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();
    
    int res = ((w*(w+1))/2)*k;
    if (n<res){
        
        System.out.println(res-n);
    }
    else {
        System.out.println(0);
    }
    sc.close();
}
    
}

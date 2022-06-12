import java.util.Scanner;
public class CF791A{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int w = 0;
        for (int i=1;i<11;i++){
            a = a*3;
            b = b*2;
            w+=1;
            if (a>b){
                break;  }
            else{
                continue; }
        }
    System.out.println(w);
    sc.close();
    }
}



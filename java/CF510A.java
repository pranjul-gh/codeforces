import java.util.Scanner;

public class CF510A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int r=1; r<row+1; r++ ){
            if (r%4 == 0){
                System.out.print("#");
               for (int co=1; co<col; co++){
                System.out.print(".");
               }
               
               System.out.println();
               
                //System.out.println("."*(col-1)+"#");
            }
            else {
                if (r%2 == 0 ){
                    for (int co=1; co<col; co++){
                     System.out.print(".");
                    }
                    System.out.print("#");
                    System.out.println(); }
                else {
                    for (int co=1; co<=col; co++){
                    System.out.print("#");}
                    System.out.println(); }
            }
        }
   sc.close();
     }
}
 
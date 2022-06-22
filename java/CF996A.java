import java.util.Scanner;
public class CF996A {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int x,s=0;
        x=sc.nextInt();
        while (x!=0){
            if (x>=1 && x<5){
                x-=1;
                s++;     }
            else if(x>=5 && x<10) {
                x -=5;
                s++;
            }
            else if(x>=10 && x<20) {
                x -=10;
                s++;
            }
            else if(x>=20 && x<100) {
                x -=20;
                s++;
            }
            else {
                x -=100;
                s++;
            }
        }
    System.out.println(s);
    sc.close();                }
        }
    
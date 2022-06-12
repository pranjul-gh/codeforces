
import java.util.Scanner;
public class CF263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pm = 0;
        int mp = 0;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    pm = 3 - i;
                    mp = 3 - j;
                }
            }
        }
        if (pm < 0)
            pm *= -1;
        if (mp < 0)
            mp *= -1;
        System.out.println(pm + mp);
    sc.close();
    }
}
import java.util.Scanner;

public class CF61A {
    public static void main(String[] rags){
        Scanner sc = new Scanner(System.in);
        String str, s1, s2;
        str = "";
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        for (int i=0; i<s1.length(); i++){
            if( s1.charAt(i) == s2.charAt(i)){
                str+="0";                     }
            else {
                str+="1";            }
        }
    System.out.println(str);
    sc.close();
   }
}

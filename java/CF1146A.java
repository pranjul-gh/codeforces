import java.util.Scanner;
public class CF1146A {
    public static void main(String pran[]){
    Scanner sc = new Scanner(System.in);
        int count=0, i,l;
        String str = sc.next();
        l=str.length();
        char[] carr = str.toCharArray();
        
        for (i=0; i<l; i++){
            if (carr[i]=='a'){
                count+=1;            }
        }

        int ter = ((count<l/2) || count<(l/2)+1)? (count+count)-1 : l;
        System.out.println(ter);

        // if ((count<l/2) || count<(l/2)+1){
        //     System.out.println((count+count)-1);        }
        // else {
        //     System.out.println(l);        }

sc.close();

    }
}
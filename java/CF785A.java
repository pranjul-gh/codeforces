//again wrong code :/
import java.util.Scanner;
public class CF785A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();}
        
    for(int j=0;j<n;j++){
        
        if (arr[j] == "Icosahedron"){
            sum+=20;         }
        if (arr[j] == "Cube" ){
            sum+=6;        }
        if (arr[j] == "Tetrahedron");{
            sum+=4;            }
        if (arr[j] == "Dodecahedron"){
            sum+=12;            }
        if (arr[j] == "Octahedron"){
      //     else {
             sum+=8;       }
           }
    System.out.println(sum);
sc.close();        
}
}
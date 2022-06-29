///Wrong code...

import java.util.Scanner;
public class CF266B {
    public static void main(String pran[]){
        Scanner sc = new Scanner(System.in);
        int n,t,i,j;
        String s="";
        n=sc.nextInt();
        t=sc.nextInt();
        String ss = sc.next();
        char arr[] = ss.toCharArray();
        // for (i=0; i<=n; i++){
        //     arr[i] = sc.nextLine();        }

        for (j=0; j<t; j++){
            for (i=0; i<n-1; i++){
                if (arr[i] != arr[i+1] && arr[i] == 'B'){
                   s+= 'G';//arr[i+1]; //="G";
                  // s+= 'B';//arr[i]; //="B";         }
                }
                // if (i==(n-1) && arr[i+1] != arr[i] && arr[i+1]=='G'){
                //     s+='G';                }
               else {
                   s+='B';                }      

             }        }
            // for (j=0;j<=n;j++){
            //     s+=arr[j];            }

    System.out.println(s);
    }
}


                        //@atyadav's

/*
import java.util.Scanner;
public class CF266B{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int m=sc.nextInt();
    String s= sc.next();
    char arr[] = s.toCharArray();
    char c;
    int j;

    for(int l=0; l<m; l++){
        for(int i=0; i<arr.length; )    {
            j=i+1;
            if(j<arr.length){
                if(arr[i]=='B' && arr[j]=='G'){
                    c=arr[i];
                    arr[i]=arr[j];
                    arr[j]=c;
                        i++;   
                } 
            }
    
        i+=1;
        }
    }
System.out.println(arr);
}}


import java.util.Scanner;
public class CF266B
{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
String s= sc.next();
char arr[] = s.toCharArray();
char c;
int j;
for(int l=0; l<y; l++)
{
for(int i=0; i<arr.length; )
{
j=i+1;
if(j<arr.length)
{
if(arr[i]=='B' && arr[j]=='G')
{
c=arr[i];
arr[i]=arr[j];
arr[j]=c;
i++;
}
}
i+=1;
}
}
System.out.println(arr);
}}*/
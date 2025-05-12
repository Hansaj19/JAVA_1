import java.util.Scanner;
public class Pal{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner jin=new Scanner(System.in);
        String s1,longest="";
        char[] arr1;
        int len,max=0;
        
        s1=jin.nextLine();
        String[] s1arr=s1.split(" ");
        for(int i=s1arr.length-1;i>=0;i--){
        }
        
        String[] s2arr=s1.split(" ");
        
        for(int i=0,j=s1arr.length-1;i<s2arr.length-1&&j>=0;i++,j--){
            if(s1arr[j].equals(s2arr[i])){
                arr1=s1arr[j].toCharArray();
                len=arr1.length;
                if(len>max){
                    max=len;
                    longest+=s1arr[j];
                }
            }
        }

        System.out.print("The longest palindromic word is: "+longest);
    }
}
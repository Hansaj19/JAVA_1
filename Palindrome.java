import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner jin = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n=jin.nextInt();
        String s1= String.valueOf(n);
        String s2= new StringBuilder(s1).reverse().toString();
        if(s1.equals(s2)){
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The number is Not Palindrome");
        }
    }
}

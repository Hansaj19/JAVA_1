// import java.time.LocalTime;
// public class Time{
//     public static void main(String [] args){
//         LocalTime now = LocalTime.now();
//         System.out.println(now);
//     }
// }
// import java.util.Scanner;
// public class Time{
//     public static void main(String args[]){
//         Scanner jin= new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int a ;
//         a=jin.nextInt();
//         if((a&1)==1){ // or we can use (a^1)!=(a+1)
//             System.out.print("Odd");
//         }
//         else{
//             System.out.print("Even");
//         }
//     }
// }

public class Time{
    public static void main(String [] args){
        //Scanner jin = new Scanner(System.in);
        int a=33,b=61;
        float sum;
        sum=((a+b)/10.0f);
        System.out.println("The Implicit sum is "+ sum);
        sum=(int)sum;
        System.out.println("The Explicit sum is "+ sum);
        
    }
}
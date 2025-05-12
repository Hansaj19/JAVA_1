import java.util.Scanner;
public class Armstrong{
    public static void main(String[] arg){
        int a,n,sum =0,org,count=0;
        @SuppressWarnings("resource")
        Scanner jin = new Scanner(System.in);
        System.out.print("Enter the number: ");
        a=jin.nextInt();
        org=a;
        for(;a!=0;a=a/10){
            count ++;
        }
        a=org;
        for(;a!=0;a=a/10){
            n=a%10;
            sum+=Math.pow(n,count);
        }
        a=org;
        if(a==sum){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}

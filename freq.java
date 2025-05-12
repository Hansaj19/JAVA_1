// import java.util.Scanner;
import java.util.Arrays;
public class freq{
    public static void main(String [] args){
        int count=0;
        int [] arr={1,3,2,3,4,5,5,1};
        Arrays.sort(arr);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            
            else{
                System.out.println(arr[i-1]+" occured: "+count+" times.");
                count=0;
            }
        }
        System.out.println(arr[arr.length-1]+" occured: "+count+" times.");
    }
}
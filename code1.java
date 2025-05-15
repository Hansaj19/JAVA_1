import java.util.Scanner;
public class code1 {
    public static void main(String[]args){
        Scanner jin = new Scanner(System.in);
        String name;
        name=jin.nextLine();
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println("The name is " + name);
        jin.close();
    }
}

// import java.util.Scanner;
// //name of class and constructor should be always same.
// public class Practice{
//     public static void main(String[] args){
//         Scanner jin = new Scanner(System.in);
//         details obj1= new details("Hansaj","23BAI192",2027);
//         obj1.display();
//     }
// }

// class details{
//     String name, reg;
//     int yog;
//     public details(String name,String reg, int yog){//paramterized constructor
//         this.name=name;
//         this.reg=reg;
//         this.yog=yog;
//     }
//     void display(){
//         System.out.println("Name: "+name+"\nReg no: "+reg+"\nYear of graduation: "+yog);
//     }
// }

public class Practice{
    public static void main(String[] args){
        complex c = new complex();
        complex c1 = new complex(2,3);
        complex c2;
        c.display();
        double d = c.magnitude(c.i,c.j);
        System.out.println("Magnitude is : "+d);
        c2=c.add(c1);
        c2.display();
    }
}
class complex{
    int i,j;
    public complex(){
        i=0;
        j=0;
    }
    public complex(int x, int y){
        i=x;
        j=y;
    }
    void display(){
        System.out.println(i+"+"+j+"j");
    }
    complex add(complex obj2){
        return new complex(obj2.i+i,obj2.j+j);
    }
    double magnitude(int i,int j){
        return Math.sqrt((this.i*this.i)+(this.j*this.j));
    }
}
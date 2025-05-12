import java.util.Scanner;

class Exercise{
    double duration;
    public Exercise(double duration){
        this.duration = duration;
    }
    public double getduration(){
        return this.duration;
    }
}

class Cardio extends Exercise{
    public Cardio(double duration){
        super(duration);
    }
}

class Running extends Exercise{
    double speed;
    public Running(double duration,double speed){
        super(duration);
        this.speed = speed;
    }
    public double calculateCaloriesBurned(){
        double cal_burn;
        cal_burn = 7.0*(getduration()/60)*3.5*(speed/3.0);
        return cal_burn;
    }
}

public class inherit{
    public static void main(String[] args) {
        double d,s;
        Scanner jin = new Scanner(System.in);
        d=jin.nextDouble();
        s=jin.nextDouble();
        Running obj1 = new Running(d,s);
        double result = obj1.calculateCaloriesBurned();
        System.out.printf("%.2f",result);
        jin.close();
    }
}
package Demo;
import java.util.Scanner;
public class circlearea {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the radius of the circle: ");
        double radius=in.nextDouble();
        double PI=3.14;
        double area=PI*radius*radius;
        System.out.println("area of the circle is "+area);
    }
}

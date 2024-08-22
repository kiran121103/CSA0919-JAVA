package Demo;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=in.nextInt();
        long factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
}

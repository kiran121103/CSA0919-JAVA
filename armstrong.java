package Demo;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=in.nextInt();
        int originalnum=num;
        int result=0;
        while(originalnum!=0){
            int digit=originalnum%10;
            result+=digit*digit*digit;
            originalnum/=10;
        }
        if(result==num){
            System.out.println(num+" is an armstrong number.");
        }else{
            System.out.println(num+" is not an armstrong number.");
        }
    }
}

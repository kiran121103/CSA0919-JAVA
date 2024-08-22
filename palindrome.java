package Demo;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num= in.nextInt();
        int originalnum=num;
        int reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        if(originalnum==reversed){
            System.out.println(originalnum+" is a palindrome.");
        }else{
            System.out.println(originalnum+" is not a palindrome.");
        }
    }
}

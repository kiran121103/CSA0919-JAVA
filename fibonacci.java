package Demo;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the range: ");
        int range=in.nextInt();
        int first=0,second=1;
        System.out.println("fibonacci series:\n"+first+"\n"+second);
        for(int i=3;i<=range;i++){
            int next=first+second;
            System.out.println(next);
            first=second;
            second=next;
        }
    }
}

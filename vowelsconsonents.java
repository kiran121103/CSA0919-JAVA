import java.util.Scanner;
public class vowelsconsonents {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string: ");
        String word=in.nextLine();
        int vowels=0;
        int constant=0;
        String input=word.toLowerCase();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            } else if (ch>='a'&& ch<='z') {
                constant++;
            }
        }
        System.out.println("number of vowels: "+vowels);
        System.out.println("number of constants: "+constant);
    }
}
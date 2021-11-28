
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        new Palindrome().check(s.nextInt());

    }

    public  void check(int num)
    {
        int a =num,r,sum=0;
        while (a>0)
        {
            r=a%10;
            a=a/10;

            sum=sum*10 + r;

        }
        if(sum==num) System.out.println(num + "it is palindrome.");
        else
            System.out.println(num + " it is not a palindrome.");
    }
}
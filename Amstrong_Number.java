import java.util.*;
public class Amstrong_Number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sum = 0, original = num;
        int length = 0, temp = num;

        while (temp != 0) {
            length++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }

}

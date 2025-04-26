import java.util.*;
public class Frequency_of_digits
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number with repeated digits:");
        int num=obj.nextInt();
        int temp = num;

        for (int d = 0; d <= 9; d++) {
            int count = 0;
            int n = temp;
            while (n != 0) {
                int digit = n % 10;
                if (digit == d) {
                    count++;
                }
                n /= 10;
            }
            if (count != 0) {
                System.out.println(d + " -> " + count);
            }
        }

    }
}

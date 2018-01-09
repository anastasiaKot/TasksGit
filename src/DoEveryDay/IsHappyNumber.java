package DoEveryDay;

import java.util.HashSet;
import java.util.Set;

public class IsHappyNumber {
    public static void main(String[]args)
    {
        for (int i = 1; i <= 1000; i++)
        {
            if (isHappyNumber(i))
            {
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean isHappyNumber(int number)
    {
        Set<Integer> unique = new HashSet<Integer>();
        while(unique.add(number))
        {
            int value = 0;
            while (number > 0) {
                value += Math.pow(number % 10, 2);
                number = number / 10;
            }
                number = value;
            }
        return number == 1;
    }
}

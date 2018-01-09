package DoEveryDay;

import java.util.HashSet;
import java.util.Set;

public class IsHappyNumber {
    public static void main(String[]args)
    {
        for (int i = 1; i <= 100; i++)
        {
            if (isHappyNumber(i))
            {
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean isHappyNumber(int number)
    {
        Set<Integer> unique = new HashSet<>();
        while(unique.add(number))
        {
            int value = 0;
            while (number > 0)
            {
                int itself = number % 10;
                value += itself*itself;
                number = number / 10;
            }
                number = value;
            }
        //return number == 1;

        if(number == 1) return true;
        else return false;
    }
}

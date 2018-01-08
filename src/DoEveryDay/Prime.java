package DoEveryDay;

public class Prime {
    public static void main(String[]args) {
        for (int i = 2; i < 100; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isPrime(int number)
    {
        if(number == 1) return false;
        if(number%2==0) return false;
        for (int i = 2; i < number; i++)
        {
            if(number % i == 0) return false;
        }
        return true;
    }
    }

package DoEveryDay;

public class PerfectNumbers {
    public static void main(String[]args) {
        for (int i = 2; i < 100; i++)
        {
            if(isPerfect(i))
            {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isPerfect(int number)
    {
        int temp = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                temp = temp + i;
            }
        }
            if (temp == number)
            {
                return true;
            }
            else  return false;
        }


}

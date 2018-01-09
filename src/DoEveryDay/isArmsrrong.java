package DoEveryDay;

public class isArmsrrong {
    public static void main(String[]args)
    {
        for (int i = 1; i <= 10000; i++)
        {
            if (isArmstrong(i))
            {
                System.out.print(i + ", ");
            }
        }
    }

    private static int length(int number) {
        int temp = number;
        int count = 0;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        return count;
    }

    private static int power(int number, int power)
    {
        int temp = 1;
        for(int i = 1; i <=power; i++)
        {
            temp = temp * number;
        }
        return temp;
    }
    private static boolean isArmstrong(int original)
    {
        int temp = 0;
        int number = original;
        int length = length(number);
        while (number > 0)
        {
            temp = temp + power(number%10,length);
            number = number/10;
        }
        if(temp == original) return true;
        else return false;
    }
}

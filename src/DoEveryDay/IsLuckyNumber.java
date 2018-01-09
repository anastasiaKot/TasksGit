package DoEveryDay;

public class IsLuckyNumber {
    public static void main(String[]args)
    {
        System.out.println(lucky(239));
    }
    private static int lucky(int input)
    {
    int sum = 0;
    int temp = input;
    while(temp > 0)
    {
        sum = sum + temp%10;
        temp = temp/10;
    }
    sum = (sum < 10) ? sum : lucky(sum);
    return sum;
    }
}

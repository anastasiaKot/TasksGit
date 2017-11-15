package DoEveryDay;

/**
 * Created by anastasia on 11/14/17.
 */
public class SumAllDigitsInNumber {
    public int sumAllDigits(int n) {
        int sum = 0;
        while(n>0)
        {
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;
    }
}

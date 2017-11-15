package DoEveryDay;

/**
 * Created by anastasia on 11/14/17.
 */
public class FactorialRecursive {

    public int factorial(int n) {

        if (n == 0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}

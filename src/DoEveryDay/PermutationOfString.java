package DoEveryDay;

/**
 * Created by anastasia on 11/14/17.
 */
public class PermutationOfString {
    public void findPermuation(String prefix,String str) {
        int n = str.length();
        if (n == 0){
            System.out.println(prefix);
        }
        else {
            for (int i = 0; i < n; i++)
            {
                findPermuation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i + 1, n));
            }
        }
    }


}

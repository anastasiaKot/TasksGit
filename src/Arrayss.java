
/**
 * Created by anastasia on 10/16/16.
 */
public class Arrayss {
    static int[] mynew = new int[10];

    public static void main(String[] args)
    {
        one();

        }

    public static void one ()
    {
        for (int i = 0; i < mynew.length; i++) {
            mynew[i] = i+7;
        }

        for (int o : mynew)
        {
            System.out.print(o + " ");
        }
        System.out.println();
        int sum = mynew[0] + mynew[1];
        System.out.println("The sum of 2 first elements is " + sum);

        //Write a loop that computes the sum of all elements in the array.
        int total = 0;
        for (int i = 0; i < mynew.length; i ++)
        {
            total += mynew[i];
        }
        System.out.println("total sum of all array elements is " + total);

        //Write a loop that finds the minimum element in the array.
        int min = 9;
        for (int i = 0; i < mynew.length; i ++)
        {
            if (mynew[i] < min)
                min = mynew[i];
        }
        System.out.println();
        System.out.println("Min value of an array is " + min);

        //Randomly generate an index and display the element of this index in the array.
        int random = (int)Math.random() * mynew.length + 1;
        System.out.println("The value of random element " + "\"" + random + "\" + " + "is " + mynew[random]);

        //Use an array initializer to create another array with the initial values 3.5, 5.5,
       // 4.52, and 5.6.
        double [] myarray = {3.5, 5.5, 4.25, 5.6};

        double[] r = new double [100];

        for (int i = 0; i < r.length; i++)
        {
            r[i] = Math.random() * 100;
        }

        int list[] = {1,2,3,4,5,6};

        for (int i = 1; i <list.length; i ++)

        {
            list[i] = list[i - 1];
        }

        for (int o : list)
        {
            System.out.print(o + " ");
        }

        for (int i = 0; i < list.length; i ++)
        {
            System.out.println(list[i] + " bla");
        }


    }

}

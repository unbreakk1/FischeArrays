package arrays;

public class EasyArray
{
    public static void main(String[] args)
    {

        // Sum of Array
        int[] easyArray = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};

        int arraySum = 0;
        for (int j : easyArray)
        {
            arraySum += j;
        }

        System.out.println("Array Sum is: " + arraySum);

        // find max value

        int max = easyArray[0];
        for(int j : easyArray)
        {
            if(j > max)
                max = j;
        }

        System.out.println("Max is: " + max);

        // Add Values of Array I guess

        int[] biggerNumbers = {11 ,12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 ,20};
        int[] result = new int[easyArray.length];

        for (int i = 0; i < easyArray.length; i++)
        {
            result[i] = easyArray[i] + biggerNumbers[i];
            System.out.println(result[i]);
        }
    }
}

package arrays;

import java.util.Scanner;

public class EasyArrayBonus
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input prompt
        System.out.print("Enter Text: ");
        String input = scanner.nextLine();

        // letter output
        System.out.println("Letters in Input: ");
        for (char c : input.toCharArray())
        {
            if (Character.isLetter(c))
                System.out.print(c + " ");
        }
        System.out.println();
    }

}

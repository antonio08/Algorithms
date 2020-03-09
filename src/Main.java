import algorithms.*;
import utils.BuildMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        BuildMenu buildMenu = new BuildMenu();
        buildMenu.buildMenu();

        final int option = Integer.parseInt(obj.readLine());

        System.out.println("Insert the string you want to process");
        String input = obj.readLine().trim();

        sortBySortingMethod(option, input);

    }

    private static void sortBySortingMethod(final int option, final String input)
    {
        int [] sortedArray = null;
        String revertedString;

        switch (option)
        {
            case 1:
                final BubbleSorting bubbleSorting = new BubbleSorting();
                sortedArray = bubbleSorting.sort(stringToIntArray(input));
                printResult(Arrays.toString(sortedArray));
                break;

            case 2:
                final int [] arrayToSort = stringToIntArray(input);
                final QuickSorting quickSorting = new QuickSorting(arrayToSort);
                sortedArray = quickSorting.sort(0, arrayToSort.length - 1);
                printResult(Arrays.toString(sortedArray));
                break;

            case 3:
                final InvertStringLoop invertStringLoop = new InvertStringLoop();
                revertedString = invertStringLoop.reverse(input);
                printResult(revertedString);
                break;

            case 4:
                final InvertStringRecursion invertStringRecursion = new InvertStringRecursion();
                revertedString = invertStringRecursion.revert(input);
                printResult(revertedString);
                break;

            case 5:
                final BalancedString balancedString = new BalancedString();
                final String messagae = balancedString.isBalanced(input) ?
                        "The string is balanced" : "The string is not balanced";
                printResult(messagae);
                break;

            case 6:
                final Factorial factorial = new Factorial();
                final int result = factorial.calculate(Integer.parseInt(input));
                printResult(String.valueOf(result));
                break;

            default:
                System.out.println("invalid option, bye");
                break;
        }
    }

    private static int [] stringToIntArray(final String input)
    {
        String [] numbersInStringArray = input.split(",");
        return Arrays.stream(numbersInStringArray)
                .mapToInt(Integer::parseInt).toArray();
    }

    private static void printResult(final String result)
    {
        System.out.println("The output is as follows: ");
        System.out.println(result);
    }
}

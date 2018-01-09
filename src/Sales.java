import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        int sum, iHigh = 0, iLow = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of salespeople: ");
        int iLen = scan.nextInt();

        int[] sales = new int[iLen];

        for (int i = 0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");

        sum = 0;

        for (int i = 0; i < sales.length; i++)
        {
            System.out.println("     " + (i + 1) + "         " + sales[i]);
            sum += sales[i];

            if (sales[i] > sales[iHigh])
                iHigh = i;

            if (sales[i] < sales[iLow])
                iLow = i;
        }

        double fAvg = sum / iLen * 1.0;

        System.out.println("Average sale: " + fAvg);
        System.out.println(String.format("Highest Sale: ID %d - %d", iHigh + 1, sales[iHigh]));
        System.out.println(String.format("Lowest Sale: ID %d - %d", iLow + 1, sales[iLow]));
        System.out.println("Total sales: " + sum);

        System.out.print("Enter a filter number: ");
        int iFilter = scan.nextInt();

        int iFilterCount = 0;

        for (int i = 0; i < sales.length; i++)
        {
            if (sales[i] >= iFilter)
            {
                System.out.println(String.format("ID %d - %d", i + 1, sales[i]));
                iFilterCount++;
            }
        }

        System.out.println("Amount of salespeople that matches the filter: " + iFilterCount);
    }
}

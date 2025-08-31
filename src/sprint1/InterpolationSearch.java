package sprint1;

import java.util.Scanner;

public class InterpolationSearch {
    public static int interpolationSearch(int[] prices, int targetPrice) {
        int low = 0, high = prices.length - 1;
        while (low <= high && targetPrice >= prices[low] && targetPrice <= prices[high]) {
            int pos = low + ((targetPrice - prices[low]) * (high - low) /
                    (prices[high] - prices[low])); // Estimate position
            if (prices[pos] == targetPrice)
                return pos; // Product found at this index
            if (prices[pos] < targetPrice)
                low = pos + 1;
            else
                high = pos - 1;
        }
        return -1; // Product not found
    }

    public static void main(String[] args) {
        int[] prices = {100, 200, 300, 400, 500, 600, 700, 800}; // Sorted prices
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the target price to search:");
        int target = sc.nextInt();
        int index = interpolationSearch(prices, target);
        System.out.println(index != -1 ? "Product found at index: " + index : "Product not found");
    }
}


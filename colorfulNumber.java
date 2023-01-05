import java.util.*;


public class prod {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(colorful(a));
    }
    public static int colorful(int A) {
        // Convert the number to a string.
        String str = String.valueOf(A);
        // Initialize a set to store the products
        Map<Integer, Integer> products = new HashMap<>();

        // iterate through the string
        for (int i = 0; i < str.length(); i++) {
            // Get all the contiguous subsequences that contain the current character
            for (int j = i; j < str.length(); j++) {
                // Calculate the product of the digits in the contiguous subsequence
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product *= Character.getNumericValue(str.charAt(k));
                }
                // Check if the product is already in the set
                if (products.containsKey(product)) {
                    return 0; // Not a COLORFUL number
                }
                // Add the product to the set
                products.put(product, 1);
            }
        }
        return 1; // COLORFUL number
    }

}

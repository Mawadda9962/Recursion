public class BunnyEars {


    public int bunnyEars2(int n) {
        if (n == 0) {
            return 0;// Base Case
        } else {
            if (n % 2 == 0) {
                return 3 + bunnyEars2(n - 1); // Checking the bunny number is even
            } else
                return 2 + bunnyEars2(n - 1);// Checking the bunny number is odd
            }
        }
    }

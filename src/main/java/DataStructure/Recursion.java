package DataStructure;

public class Recursion {


    static int arr[] = {100, 2, 30, 13, 5};


    public static void main(String[] args) {

        int value = SumOfDigitsMethod(arr.length - 1);
        System.out.println("Sum of Digits is " + value);
    }

    private static int SumOfDigitsMethod(int n) {

        if (n == 0)
            return arr[n];// arr of [0] index
            return arr[n] + SumOfDigitsMethod(n - 1); // minuses one index from index 4 -1
        // the base index 0 is 100 number
        // I know Aida lil bit confusing But try to understand the main Concept



    }

}


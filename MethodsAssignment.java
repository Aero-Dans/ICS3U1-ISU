import java.util.*;

class MethodsAssignment {
    public static void main(String[] args){   
    }

    /**
     * Get the sum of 3 double variables
     * @param num1 is First Double
     * @param num2 is Second Double
     * @param num3 is Third Double
     * 
     * @return sum after adding al 3 double values
     */
    
    public static double addDoubles(double num1, double num2, double num3) {
        double sum = num1 + num2 + num3;
        return sum;
    }

    
    /**
     * Give the remainder of two integers
     * @param dividend is First Integer, 
     * @param divisor is Second Integer
     * 
     * @return remainder of the two integers using the modulo operation
     */

    public static int findRemainder(int dividend, int divisor) {
        int remainder = dividend % divisor;
        return remainder;
    }


    /**
     * Check if a given number is a Prime Number
     * @param num is a Integer
     * 
     * @return false if num is divisible by numbers other than 1 and itself, otherwise true
     */

    public static boolean checkPrimeNum(int num) {
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }    
        }
        return true;
    }


    /**
     * Check if int b is a factor of int a
     * @param a is Integer 1
     * @param b is Integer 2
     * 
     * @return true if int b is a factor by using modulo, otherwise false
     */

    public static boolean isFactor(int a, int b) {
        if (a % b == 0) {
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * Find the factors of num and put in ArrayList 
     * @param num is a Integer
     * 
     * @return factors once counted all the factors of num
     */

    public static ArrayList<Integer> factors(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }


    /**
     * Count the number of vowels from the String word
     * @param word is a String
     * 
     * @return vowelCount the number of vowels after counting all the vowels inside the word
     */

    public static int countVowels(String word) {
        char[] letters = word.toCharArray();

        int vowelCount = 0;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;  
    }


    /**
     * Check if a given string is a palindrome
     * @param word is a String
     * 
     * @return true if text is a palindrome, otherwise false
     */

    public static boolean isPalindrome(String word) {
        char[] wordArray = new char[word.length()];
        wordArray = word.toCharArray();

        char[] reversedArray = new char[wordArray.length];
        
        int j = 0;
        for (int i = wordArray.length - 1; i >= 0; i--) {
            reversedArray[j] = wordArray[i];
            j++;
        }

        String str_wordArray = Arrays.toString(wordArray);
        String str_reversedArray = Arrays.toString(reversedArray);

        if (str_wordArray.equals(str_reversedArray)){
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * Check if an array of sorted integers has two unique values whose sum adds up to the target 
     * @param nums is Array of sorted integers
     * @param target is Integer 
     * 
     * @return true if the target value is a sum of two unique values in the array, otherwise false
     */

    public static boolean uniqueValues(int[] nums, int target) {
        for (int a : nums) {
            for (int b : nums) {
                if (a != b && a + b == target) {
                    return true;
                }
            }
        }
        return false;
    }

    
    /**
     * Calculates the Average/Mean of a double array
     * @param nums is a double array
     * 
     * @return average of the sum of the array divided by length
     */

    public static double calculateAverage(double[] nums) {

        double total = 0;
        
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }

        double average = total / nums.length;

        return average;   
    }

    
    /**
     * Takes an integer ArrayList and sorts it from least to greatest
     * @param list is an Integer ArrayList
     * 
     * @return sorted once the entire array has been sorted through
     */

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {

        ArrayList<Integer> sorted = new ArrayList<Integer>();
        sorted = list;
        
        int n = list.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (sorted.get(j) > sorted.get(j + 1)) {
                    int temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return sorted;
    }
    
}

    
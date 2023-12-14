import java.util.Scanner;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a word:");
        String uinput = sc.nextLine();
        char[] word_array = uinput.toCharArray();

        char[] reverse_array = new char[word_array.length];

        int j = 0;
        for (int i = word_array.length - 1; i >= 0; i--) {
            reverse_array [j] = word_array[i];
            j++;
        }

        boolean palindrome = true;
        
        for (int i = 0; i < word_array.length; i++) {
            if (word_array[i] != reverse_array[i]) {
                palindrome = false;
                break;
            }        
        }

        if (palindrome) {
            System.out.println(uinput + " is a palindrome");
        }
        else {
            System.out.println(uinput + " is not a palindrome");
        }
        
        // Scanner Close
        sc.close();
  }
}
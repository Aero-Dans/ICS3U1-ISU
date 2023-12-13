import java.util.*;

class SearchString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many strings in your array?");
    String uinput1 = sc.nextLine();
    int size = Integer.parseInt(uinput1);

    String[] words = new String[size];

    for (int i = 0; i < words.length; i++) {
        System.out.println("Enter word:");
        words[i] = sc.nextLine();
    }

    System.out.println("Enter the word search:");
    String wordSearch = sc.nextLine();

    int location = -1;

    for (int i = 0; i < words.length; i++) {
        if (words[i].equals(wordSearch)) {
            location = i;
            break;  
        }
    }

    if (location == -1) {
        System.out.println(wordSearch + " can not be found in the array.");
    }
    else {
        System.out.println(wordSearch + " can be found at the index of " + location);
    }

  }
}
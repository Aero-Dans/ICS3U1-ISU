import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> database = new ArrayList<Integer>();
    String uinput = "";

    while (true) {
        System.out.println("Enter a value, input Exit to stop.");
        uinput = sc.nextLine();

        if (uinput.equals("Exit")) {
            break;
        }
        else {
            int num = Integer.parseInt(uinput);
            database.add(num);
        }
    }

    System.out.println("Current database " + database);

    ArrayList<Integer> no_dup = new ArrayList<Integer>();

    for (int num : database) {
        if (no_dup.size() == 0) {
            no_dup.add(num);
        }
        else {
            boolean exist = false;

            for (int num2 : database) {
                if (num == num2) {
                    exist = true;
                    break;
                }
            }
            if (!(exist)){
            no_dup.add(num);
            }    
        }
    }

    System.out.println(no_dup);

    sc.close();
  }
}
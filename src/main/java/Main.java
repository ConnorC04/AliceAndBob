import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main main = new Main();
        // call the compute() method on that new object
        main.compute();
    }

    public void compute() {
        // Get input string of name from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scan.nextLine();
        // Create conditional to check name against Alice and Bob
        boolean isAlice = false;
        boolean isBob = false;
        if (name.equals("Alice")){
            isAlice = true;
        }else{
            if (name.equals("Bob")){
               isBob = true;
            }
        }

        // Print greeting to screen if Alice or Bob are true
        if (isBob) {
            System.out.println("Hello Bob!");
        }else{
            if (isAlice){
                System.out.println("Hello Alice!");
            }
        }
        // Print "You are neither Alice nor Bob." otherwise
        if (!isAlice && !isBob){
            System.out.println("You are neither Alice nor Bob.");
        }
    }
}

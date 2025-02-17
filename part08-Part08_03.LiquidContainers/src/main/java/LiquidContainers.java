
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100" + System.lineSeparator() + 
                "Second: " + second + "/100");
            
            System.out.print("> ");                     
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                System.out.println("Seeya");
                break;
            } else {
                String[] splitInput = input.split(" ");
                String command = splitInput[0];
                                                            
                if (splitInput.length > 1 && (splitInput[1].trim().equals("") || splitInput[1] != null )) {
                    int amount = Integer.valueOf(splitInput[1]);
                    
                    if (command.equals("add") && amount > 0) {
                        if ( first + amount >= 100 ) {
                            first = 100;
                        } else {               
                            first += amount;
                            System.out.println(first);
                        }                    
                    }                    
                    if (command.equals("move") && amount > 0) {                        
                        // is first container less than amount                        
                        if (first < amount) {
                            amount = first;
                        }
                        //handle second value
                        if ( second + amount >= 100) {
                            second = 100;
                        } else {               
                            second += amount;                            
                        }   
                        // handle first value
                        if (first - amount <= 0){
                            first = 0;
                        } else {
                            first -= amount;
                        }
                    }
                    if (command.equals("remove") && amount > 0) {                         
                        if (second < amount ) {
                            amount = second;
                        }                        
                        if ( second - amount <= 0 || second == 0) {
                            second = 0;
                        } else {
                            second -= amount;
                        }                    
                    }                    
                } else {System.out.println("Amount must be a valid integer");}                
            }
        }
        
    }
    
//    static boolean isInputInt(String userInput) {
//            int test;
//            if (userInput == null || userInput.trim().equals("")) {
//                return false;
//            }
//            try {
//                test = Integer.valueOf(userInput);
//                return true;
//            } catch (NumberFormatException e) {
//                return false;
//            }
//    }

}

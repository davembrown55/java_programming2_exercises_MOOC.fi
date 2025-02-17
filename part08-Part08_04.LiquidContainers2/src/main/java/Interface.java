
import java.util.Scanner;
/**
 *
 * @author davem
 */
public class Interface {
    private Scanner interfaceScan;
    private Container container1;
    private Container container2;
            
    public Interface (Scanner scanner, Container containerA, Container containerB) {
       this.interfaceScan = scanner;
       this.container1 = containerA;
       this.container2 = containerB;
    }
    
    public void run () {       
         while (true) {             
            printUpdate();
            String input = interfaceScan.nextLine();                        
            String [] splitInput = input.split(" ");            
            if (splitInput[0].equals("quit")) {
                break;
            } else if (splitInput.length > 1 && isInputInt(splitInput[1]) ) {
                int amount = Integer.valueOf(splitInput[1]);
                String command = splitInput[0];                
                switch(command) {
                    case "add":
                        container1.add(amount);
                        break;
                    case "move":
                        int initialCont1val = container1.contains();
                            container1.remove(amount);
                        if (amount >= initialCont1val){                            
                            container2.add(initialCont1val);
                        } else {                            
                            container2.add(amount);
                        }
                        break;
                    case "remove":
                        container2.remove(amount);
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    private boolean isInputInt(String userInput) {
        int test;
        if (userInput == null || userInput.trim().equals("")) {
            return false;
        }
        try {
            test = Integer.valueOf(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private void printUpdate () {
        System.out.println("First: " + container1 + System.lineSeparator() + 
                "Second: " + container2);
    }
}


/**
 *
 * @author davem
 */

import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private TodoList myList;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scan = scanner;
        this.myList = list;      
    }
    
    public void start() {    
        while(true) {

            System.out.println("Command: ");
            String input = scan.nextLine();
            
            if(input.toLowerCase().equals("stop")){
                break;
            } else {
                switch(input.toLowerCase()){
                    case "add":
                        System.out.println("To add: ");
                        String toAdd = scan.nextLine();
                        if(toAdd.trim().length() > 0){
                            myList.add(toAdd);
                        }                        
                        break;
                    case "remove":
                        System.out.println("To remove: ");   
                        String toRemove = scan.nextLine();
                        if (isInputInt(toRemove)) {
                            myList.remove(Integer.valueOf(toRemove));
                        }
                        break;
                    case "list":
                        myList.print();
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
}

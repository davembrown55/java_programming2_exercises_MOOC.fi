
import java.util.Scanner;

public class Cubes {               
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        while (true) {            
//            System.out.println("Enter a number to cube, or enter 'end' to quit");
            String userInput = scanner.nextLine();            
            if (userInput.toLowerCase().equals("end") ) {
             break;
            } else {
                boolean isNum = isInputInt(userInput);
                if (isNum) {
                    int userIntVal = Integer.valueOf(userInput);                    
                    int result = userIntVal * userIntVal * userIntVal;
                    System.out.println(result);
                } 
            }         
        } 
        System.out.println("end");
    }    
    static boolean isInputInt (String userStr) {  
        int intVal;        
        if(userStr == null || userStr.trim().equals("")) {
//            System.out.println("You didnt enter anything");
            return false;
        }        
        try {
            intVal = Integer.valueOf(userStr);
            return true;
             } catch (NumberFormatException e){
//                 System.out.println("Input must be a number");
                return false;
             }        
    }
}
        

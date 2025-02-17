
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AverageOfPositiveNumbers {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        ArrayList<Integer> numStore = new ArrayList<Integer>();
//        System.out.println("Give me positive numbers and I will find the average. " + 
//                    System.lineSeparator() + "Enter 0 when you're done");
        while (true) {            
            String userInput = scanner.nextLine(); 
            if(isInputInt(userInput)) {
                int num = Integer.valueOf(userInput);
                if(num > 0){
                    numStore.add(num);                
                } else if (num == 0){                    
                    getAverage(numStore);                    
                    break;
                } else {
                    System.out.println("Please enter a valid integer.");
                }
            }
        }
        scanner.close();
    }
    
    static void getAverage (ArrayList<Integer> numList) {
        ListIterator<Integer> listIterator = numList.listIterator();
        int sum = 0;
        while(listIterator.hasNext()) {
            int currentNum = listIterator.next();            
            sum += currentNum;        
        }
        if (sum > 0) {            
            double result = (double) sum / numList.size();
            System.out.println(result);
        } else {
            System.out.println("Cannot calculate the average");
        }        
    }
    
    static boolean isInputInt(String userInput) {
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

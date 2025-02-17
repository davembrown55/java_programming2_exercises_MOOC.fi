
import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {               
        Container container1 = new Container();
        Container container2 = new Container();        
        Scanner scan = new Scanner(System.in);        
        Interface programControl = new Interface(scan, container1, container2);        
        programControl.run();
        
    }
}

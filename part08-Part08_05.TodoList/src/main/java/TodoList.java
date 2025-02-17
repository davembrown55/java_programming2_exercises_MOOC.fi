
import java.util.ArrayList;
/**
 *
 * @author davem
 */
public class TodoList {
    private ArrayList<String> list; 
    
    public TodoList () {
        this.list = new ArrayList<String>();
    }
    
    public void add(String task){
       this.list.add(task);    
    }
    
    public void print() {
        int cnt = 1;
        for (String item : this.list ) {
            System.out.println(cnt + ": " + item);
            cnt++;
        }
    }          
            
    public void remove(int number) {
        this.list.remove(number - 1);
    }  
}

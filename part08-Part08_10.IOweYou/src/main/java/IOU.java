
import java.util.HashMap;

/**
 *
 * @author davem
 */
public class IOU {
    private HashMap<String, Double> IOUList; 
    
    public IOU(){
        this.IOUList = new HashMap <>();
    }
    
    public void setSum(String toWhom, double amount){
        this.IOUList.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if(toWhom == null || toWhom.trim().length() == 0 
                || this.IOUList.get(toWhom) == null) {
            return 0; 
        } else {
             return this.IOUList.get(toWhom);
        }
        
    }
}

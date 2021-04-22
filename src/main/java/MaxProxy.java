import java.util.logging.Level;
import java.util.logging.Logger;

public class MaxProxy implements InfMax{
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private InfMax maxObject;

    public MaxProxy(InfMax maxObject){
        this.maxObject = maxObject;
    }

    @Override
    public void max(int a, int b) {
        log("max method starts...");
        maxObject.max(a, b);
        log("max method ends...");
    }

    private void log(String msg){
        logger.log(Level.INFO,msg);
    }
}

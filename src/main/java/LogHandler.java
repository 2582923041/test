import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
    private Object obj;
    public LogHandler(){}

    public LogHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method to start");
        method.invoke(obj,args);
        System.out.println("Method to complete execution");
        return null;
    }
}

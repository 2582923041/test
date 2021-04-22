import java.lang.reflect.Proxy;

public class Test2 {
    public static void main(String[] args) {
        MaxCalculators maxCalculators = new MaxCalculators();
        LogHandler logHandler = new LogHandler(maxCalculators);
        Class cls = maxCalculators.getClass();
        InfMax infMax = (InfMax) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),logHandler);
        infMax.max(3,5);
    }
}

public class Test {
    public static void main(String[] args) {
        InfMax proxy = new MaxProxy(new MaxCalculators());
        int a = 3;
        int b = 5;
        proxy.max(3, 5);
    }
}

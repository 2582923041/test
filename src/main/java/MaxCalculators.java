public class MaxCalculators implements InfMax{
    @Override
    public void max(int a, int b) {
        System.out.println(a + "    " + b);
        int max = a > b ? a : b;
        System.out.println(max);
    }
}

public class Math {
    public boolean isTriangle( double a, double b , double c) {
        return ((a + b) > c)&&((a + c) > b) &&((b + c) > a);
    }
}

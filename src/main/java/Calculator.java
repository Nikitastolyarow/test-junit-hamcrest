public class Calculator {

    public int add(int a , int b){
        return  a + b;
    }
    public int subtract(int a , int b){
        return  a - b;
    }
    public int multiply(int a , int b){
        return  a * b;
    }
    public int devide(int a , int b){
        return  a / b;
    }
    public int factorial( int n){
        if( n < 0){
            throw new IllegalArgumentException("Факториал не может быть рассчитан для отрицательных чисел");
        }
        if( n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public boolean comparison( double a , double b){
        return  a <= b ;
    }

}

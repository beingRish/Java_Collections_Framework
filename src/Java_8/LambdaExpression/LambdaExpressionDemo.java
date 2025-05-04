package Java_8.LambdaExpression;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        // lambda expression --> lambda expreession is an anonymous function ( no name, no return type, no access modifier )

        Thread t1 = new Thread(() -> System.out.println("Hello"));

        MathOperation sumOperation = (a, b) -> a + b;
        MathOperation subtractOperation = (a, b) -> a - b;

        int res = sumOperation.operate(1, 2);
        System.out.println(res);
    }
}



interface  MathOperation {
    int operate(int a, int b);
}
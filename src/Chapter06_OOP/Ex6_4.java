package Chapter06_OOP;

class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm;
        mm = new MyMath();
        // MyMath mm = new MyMath();

        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5.0, 3.0);
        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}

class MyMath{
    long add(long a, long b) {
        long result = a + b;
        return result;
        }
    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    double divide(double a, double b) { return a / b; }

    // long vs double
    // 주요 차이점:

    // double은 실수 데이터를 나타내고, 소수점 이하 값을 포함합니다.
    // double pi = 3.14159265359

    // long은 정수 데이터를 나타내며, 소수점 이하 값을 포함하지 않습니다.
    // double은 부동 소수점 형식을 사용하므로 정밀도와 부동 소수점 오류에 주의해야 합니다.

    // long은 정수 형식으로 정확한 정수 값을 저장합니다.
    // double은 연산 시 부동 소수점 연산과 관련된 문제가 있을 수 있으며,
    // 값 비교와 같은 작업이 정확하지 않을 수 있습니다.
    // long은 정수 연산에서 정확합니다.

    // double은 계산을 수행할 때 연산 속도가 빠르지만, 정밀도와 반올림 오류를 고려해야 합니다.
    // long은 정확하지만 대용량 데이터 처리에는 적합하지 않을 수 있습니다.
}
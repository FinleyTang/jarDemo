package TestCode.cukor.calc;

public class MyCalc {
    // 加法
    public static int add(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    // 减法
    public static int sub(int... numbers) {
        int first = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            first -= numbers[i];
        }
        return first;
    }

    // 乘法
    public static int mult(int... numbers) {
        int result = 1;
        for (int i : numbers) {
            result *= i;
        }
        return result;
    }

    // 除法
    public static int div(int... numbers) {
        int first = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            try {
                first /= numbers[i];
            } catch (Exception e) {
                System.out.println("除数不能为0，程序异常：" + e.getMessage());
            }
        }
        return first;
    }
}

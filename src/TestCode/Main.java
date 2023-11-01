package TestCode;

import TestCode.cukor.calc.MyCalc;

public class Main {
    public static void main(String[] args) {
        int result;
        result = MyCalc.add(1, 0, 3, 4);
        printResult("加法", result);
        result = MyCalc.sub(9, 32, 3, -10);
        printResult("减法", result);
        result = MyCalc.mult(4, 3, 2);
        printResult("乘法", result);
        result = MyCalc.div(4, 2, -1);
        printResult("除法", result);
        System.out.println("程序结束");
    }

    public static void printResult(String string, int result) {
        System.out.println(string + result);
    }
}

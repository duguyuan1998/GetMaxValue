package com.duguyuan;

public class Demo {

    /**
     * 获取两个整型值的最大值
     */
    public static int getMax(int value1, int value2) {
        return value1 >= value2 ? value1 : value2;
    }

    /**
     * 获取三个整型值的最大值
     */
    public static int getMax(int value1, int value2, int value3) {
        value1 = getMax(value1, value2);
        return getMax(value1, value3);
    }

    /**
     * 获取两个双精度值的最大值
     */
    public static double getMax(double value1, double value2) {
        return value1 >= value2 ? value1 : value2;
    }

    /**
     * 获取三个双精度值的最大值
     */
    public static double getMax(double value1, double value2, double value3) {
        value1 = getMax(value1, value2);
        return getMax(value1, value3);
    }

    public static void main(String[] args) {
        int int_value1 = 6, int_value2 = 12, int_value3 = 10;
        // 取得6和12的最大值
        System.out.printf("%d, %d的最大值为：%d\n", int_value1, int_value2, getMax(int_value1, int_value2));
        // 取得6, 12, 10三者的最大值
        System.out.printf("%d, %d, %d的最大值为：%d\n", int_value1, int_value2, int_value3, getMax(int_value1, int_value2, int_value3));

        double double_value1 = 19.35, double_value2 = 28.99, double_value3 = 65.99;
        // 取得19.35, 28.99, 65.99三者的最大值
        System.out.println(double_value1 + ", " + double_value2 + ", " + double_value3 + "的最大值为：" + getMax(double_value1, double_value2, double_value3));
        // 取得9.58, 18.65的最大值
        double double_value4 = 9.58, double_value5 = 18.65;
        System.out.println(double_value4 + ", " + double_value5 + "的最大值为：" + getMax(double_value4, double_value5));
    }

}

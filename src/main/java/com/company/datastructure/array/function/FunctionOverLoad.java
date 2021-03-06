package com.company.datastructure.array.function;

/**
 * Created by lilei on 2017/7/11.
 * 重载MyClass类的info方法
 * 1.方法名相同
 * 2.方法的参数类型、个数顺序至少有一项不同
 * 3.方法的返回类型可以不同
 * 4.方法的修饰符可以不相同
 * 5.main方法可以被重载
 */
class MyClass {
    int height;

    MyClass() {
        System.out.println("无参数构造函数");
        height = 4;
    }

    MyClass(int i) {
        System.out.println("房子的高度为 " + i + " 米");
        height = i;
    }

    void info() {
        System.out.println("房子的高度为 " + height + " 米");
    }

    void info(String s) {
        System.out.println(s + ": 房子的高度为 " + height + " 米");
    }
}

public class FunctionOverLoad {
    public static void main(String[] args) {
        MyClass t = new MyClass(3);
        t.info();
        t.info("重载方法");
        // 重载构造函数
        new MyClass();
    }
}

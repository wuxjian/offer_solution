package the.wuxjian.solution.ch01;

/**
 *  题目描述： 设计一个类， 只能生成该类的一个实例
 *  线程安全的懒汉式： 静态内部类(只有使用到内部类的成员变量时，才会初始化)
 *  Created by wuxjian on 2021/4/1
 */
public class Singleton {
    static {
        System.out.println("Singleton 初始化");
    }

    public static int f = 0;

    private static class SingletonHolder {
        static {
            System.out.println("SingletonHolder 初始化");
        }
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }

    private Singleton() {}

    public static void main(String[] args) {
        System.out.println(Singleton.f);
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}

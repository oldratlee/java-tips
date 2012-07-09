package com.oldratlee.initorder;

class Father {
    Object obj1 = new Object() {
        {
            System.out.println("Init Father Attribute!");
        }
    };

    public Father() {
        System.out.println("Run Father Constructor!");
    }
}

public class Son extends Father {
    Object obj2 = new Object() {
        {
            System.out.println("Init Son Attribute!");
        }
    };

    public Son() {
        super(); // 这是缺省构造函数，可以省略这一行
        System.out.println("Run Son Constructor!");
    }

    /**
     * Explanation:
     * http://oldratlee.com/576/tech/java/java-object-initialization-order.html
     */
    public static void main(String[] args) {
        new Son();
    }
}
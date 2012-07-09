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
        super();
        System.out.println("Run Son Constructor!");
    }

    public static void main(String[] args) {
        new Son();
    }
}
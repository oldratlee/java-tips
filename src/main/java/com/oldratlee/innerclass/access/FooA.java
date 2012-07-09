package com.oldratlee.innerclass.access;

public class FooA {
    private int attrib;
    private static int staticAttrib;

    public class Inner1 {
        private int a1;

        public int method1() {
            return attrib;
        }
    }

    public static class StaticInner2 {
        private int sa1;

        public int method2() {
            return staticAttrib;
        }
    }

    public int method() {
        int a = new Inner1().a1;
        a += new StaticInner2().sa1;
        return a;
    }
}

package com.oldratlee.innerclass.access;
 
public class FooB {
    private int foo;
    private int age;
 
    public class Inner {
        private int foo;
 
        public int method() {
            return foo + FooB.this.foo + age;
        }
    }
}

package com.oldratlee.innerclass.serialization;

import junit.framework.TestCase;

import java.io.Serializable;

public class StaticClassSerialization_JUnit3_Test extends TestCase {
    
    interface FooInterface2 extends Serializable {
        public Object getData();
    }

    static FooInterface2 getData = new FooInterface2() {
        private static final long serialVersionUID = 1L;

        public Object getData() {
            return null;
        }
    };
    
    public static class FooClass2 implements Serializable {
        private static final long serialVersionUID = 88940079192401092L;
    }
    
    public void testSerializable_Attribute_StaticAnonymousClass() throws Exception {
        Util.writeObject(getData);
    }

    public static void testSerializable_LocalVar_StaticAnonymousClass() throws Exception {
        FooInterface2 local = new FooInterface2() {
            private static final long serialVersionUID = 1L;
            public Object getData() {
                return null;
            }
        };
        
        Util.writeObject(local);
    }
    
    public void testSerializable_StaticInnerClass() throws Exception {
        FooClass2 data = new FooClass2();
        Util.writeObject(data);
    }
}

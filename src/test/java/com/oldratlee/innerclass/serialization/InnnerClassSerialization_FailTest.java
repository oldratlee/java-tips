package com.oldratlee.innerclass.serialization;
import com.oldratlee.innerclass.com.oldratlee.innerclass.serialization.Util;
import org.junit.Test;

import java.io.Serializable;

public class InnnerClassSerialization_FailTest {
    interface FooInterface1 extends Serializable {
        public Object getData();
    }

    FooInterface1 attributeData = new FooInterface1() {
           private static final long serialVersionUID = 1L;
           public Object getData() {
               return null;
           }
       };

    public class FooClass1 implements Serializable {
        private static final long serialVersionUID = 1L;
    }
    
    @Test
    public void testSerializable_Attribute_AnonymousClass() throws Exception {
        Util.writeObject(attributeData);
    }
    
    @Test
    public void testSerializable_LocalVar_AnonymousClass() throws Exception {
        FooInterface1 local = new FooInterface1() {
            private static final long serialVersionUID = 1L;
            public Object getData() {
                return null;
            }
        };
        
        Util.writeObject(local);
    }

    @Test
    public void testSerializable_InnerClass() throws Exception {
        FooClass1 data = new FooClass1();
        Util.writeObject(data);
    }
}
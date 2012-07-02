package com.oldratlee.innerclass.serialization;

import com.oldratlee.innerclass.com.oldratlee.innerclass.serialization.Util;
import org.junit.Test;

import java.io.Serializable;

public class StaticInnerClassSerializationTest {

    interface FooInterface3 extends Serializable {
        public Object getData();
    }

    static FooInterface3 getData = new FooInterface3() {
        private static final long serialVersionUID = 1L;

        public Object getData() {
            return null;
        }
    };

    public static class FooClass3 implements Serializable {
        private static final long serialVersionUID = 88940079192401092L;
    }

    @Test
    public void testSerializable_Attribute_StaticAnonymousClass() throws Exception {
        Util.writeObject(getData);
    }

    @Test
    public void testSerializable_StaticInnerClass() throws Exception {
        FooClass3 data = new FooClass3();
        Util.writeObject(data);
    }
}

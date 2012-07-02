package com.oldratlee.innerclass.serialization;

import org.junit.Test;

import java.io.Serializable;

public class StaticInnerClassSerializationTest {

    interface GetDataInterface extends Serializable {
        public Object getData();
    }

    static GetDataInterface getData = new GetDataInterface() {
        private static final long serialVersionUID = 1L;

        public Object getData() {
            return null;
        }
    };

    public static class ClassImplSerialize implements Serializable {
        private static final long serialVersionUID = 88940079192401092L;
    }

    @Test
    public void testSerializable_Attribute_StaticAnonymousClass() throws Exception {
        Util.writeObject(getData);
    }

    @Test
    public void testSerializable_StaticInnerClass() throws Exception {
        ClassImplSerialize data = new ClassImplSerialize();
        Util.writeObject(data);
    }
}

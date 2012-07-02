package com.oldratlee.innerclass.serialization;

import junit.framework.TestCase;

import java.io.Serializable;

public class StaticClassSerialization_JUnit3_Test extends TestCase {
    
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
    
    public void testSerializable_Attribute_StaticAnonymousClass() throws Exception {
        Util.writeObject(getData);
    }

    public static void testSerializable_LocalVar_StaticAnonymousClass() throws Exception {
        GetDataInterface local = new GetDataInterface() {
            private static final long serialVersionUID = 1L;
            public Object getData() {
                return null;
            }
        };
        
        Util.writeObject(local);
    }
    
    public void testSerializable_StaticInnerClass() throws Exception {
        ClassImplSerialize data = new ClassImplSerialize();
        Util.writeObject(data);
    }
}

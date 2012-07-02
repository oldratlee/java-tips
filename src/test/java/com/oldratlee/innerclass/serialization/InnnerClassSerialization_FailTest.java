package com.oldratlee.innerclass.serialization;
import org.junit.Test;

import java.io.Serializable;

public class InnnerClassSerialization_FailTest {
    interface GetDataInterface extends Serializable {
        public Object getData();
    }

    GetDataInterface attributeData = new GetDataInterface() {
           private static final long serialVersionUID = 1L;
           public Object getData() {
               return null;
           }
       };

    public class InnerClassSerialize implements Serializable {
        private static final long serialVersionUID = 1L;
    }
    
    @Test
    public void testSerializable_Attribute_AnonymousClass() throws Exception {
        Util.writeObject(attributeData);
    }
    
    @Test
    public void testSerializable_LocalVar_AnonymousClass() throws Exception {
        GetDataInterface local = new GetDataInterface() {
            private static final long serialVersionUID = 1L;
            public Object getData() {
                return null;
            }
        };
        
        Util.writeObject(local);
    }

    @Test
    public void testSerializable_InnerClass() throws Exception {
        InnerClassSerialize data = new InnerClassSerialize();
        Util.writeObject(data);
    }
}
package com.oldratlee.innerclass.com.oldratlee.innerclass.serialization;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Util {
    public static <T> void writeObject(T data) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new ByteArrayOutputStream());
            out.writeObject(data);
        } finally {
            if (null != out) {
                try {
                    out.close();
                } catch (Exception e) {
                }
            }
        }
    }
}

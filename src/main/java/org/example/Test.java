package org.example;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;

/**
 * @author xiongyu
 * @date 2021/12/30 下午2:34
 */
public class Test {

    public interface CppRouteSoLibrary extends Library {
        int Add(IntByReference a, IntByReference b);
    }

    public static void main(String[] args) {
        CppRouteSoLibrary INSTANCE = (CppRouteSoLibrary) Native.loadLibrary("/Users/Jeff/Documents/workspace-hxkj3.0/cloud-grpc-java/DllDemo.dll", CppRouteSoLibrary.class);
        IntByReference a = new IntByReference(1);
        IntByReference b = new IntByReference(10);
        int c = INSTANCE.Add(a, b);
        System.out.println(c);
    }
}

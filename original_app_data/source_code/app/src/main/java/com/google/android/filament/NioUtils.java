package com.google.android.filament;

import com.google.android.filament.proguard.UsedByNative;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("NioUtils.cpp")
final class NioUtils {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum BufferType {
        BYTE,
        CHAR,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE
    }

    private NioUtils() {
    }

    @UsedByNative("NioUtils.cpp")
    public static Object getBaseArray(Buffer buffer) {
        if (buffer.hasArray()) {
            return buffer.array();
        }
        return null;
    }

    @UsedByNative("NioUtils.cpp")
    public static int getBaseArrayOffset(Buffer buffer, int i10) {
        if (buffer.hasArray()) {
            return (buffer.arrayOffset() + buffer.position()) << i10;
        }
        return 0;
    }

    @UsedByNative("NioUtils.cpp")
    public static long getBasePointer(Buffer buffer, long j10, int i10) {
        if (j10 != 0) {
            return j10 + ((long) (buffer.position() << i10));
        }
        return 0L;
    }

    @UsedByNative("NioUtils.cpp")
    public static int getBufferType(Buffer buffer) {
        return buffer instanceof ByteBuffer ? BufferType.BYTE.ordinal() : buffer instanceof CharBuffer ? BufferType.CHAR.ordinal() : buffer instanceof ShortBuffer ? BufferType.SHORT.ordinal() : buffer instanceof IntBuffer ? BufferType.INT.ordinal() : buffer instanceof LongBuffer ? BufferType.LONG.ordinal() : buffer instanceof FloatBuffer ? BufferType.FLOAT.ordinal() : BufferType.DOUBLE.ordinal();
    }
}

package org.jni_zero;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("jni_zero")
public class JniInit {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @CalledByNative
    private static void crashIfMultiplexingMisaligned(long j10, long j11) {
        try {
            long j12 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j13 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j12 != j10 && j12 != j11 && j13 != j10) {
                throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j10 + " or " + j11 + " Java: " + j12 + " or " + j13);
            }
        } catch (ReflectiveOperationException unused) {
        }
    }

    @CalledByNative
    private static Object[] init() {
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP};
    }
}

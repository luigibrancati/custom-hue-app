package Fa;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final ByteBuffer b(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.limit(iLimit).position(iPosition);
        byteBufferAllocate.limit(iLimit).position(iPosition);
        AbstractC4862t.b(byteBufferAllocate);
        return byteBufferAllocate;
    }
}

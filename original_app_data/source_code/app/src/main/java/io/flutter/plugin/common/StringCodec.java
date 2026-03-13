package io.flutter.plugin.common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class StringCodec implements MessageCodec<String> {
    private static final Charset UTF8 = Charset.forName("UTF8");
    public static final StringCodec INSTANCE = new StringCodec();

    private StringCodec() {
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public String decodeMessage(ByteBuffer byteBuffer) {
        byte[] bArrArray;
        int iArrayOffset;
        if (byteBuffer == null) {
            return null;
        }
        int iRemaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            iArrayOffset = byteBuffer.arrayOffset();
        } else {
            bArrArray = new byte[iRemaining];
            byteBuffer.get(bArrArray);
            iArrayOffset = 0;
        }
        return new String(bArrArray, iArrayOffset, iRemaining, UTF8);
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer encodeMessage(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(UTF8);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bytes.length);
        byteBufferAllocateDirect.put(bytes);
        return byteBufferAllocateDirect;
    }
}

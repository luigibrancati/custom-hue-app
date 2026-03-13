package io.flutter.plugin.common;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface MethodCodec {
    Object decodeEnvelope(ByteBuffer byteBuffer);

    MethodCall decodeMethodCall(ByteBuffer byteBuffer);

    ByteBuffer encodeErrorEnvelope(String str, String str2, Object obj);

    ByteBuffer encodeErrorEnvelopeWithStacktrace(String str, String str2, Object obj, String str3);

    ByteBuffer encodeMethodCall(MethodCall methodCall);

    ByteBuffer encodeSuccessEnvelope(Object obj);
}

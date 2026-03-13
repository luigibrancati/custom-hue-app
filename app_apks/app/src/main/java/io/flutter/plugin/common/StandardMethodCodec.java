package io.flutter.plugin.common;

import io.flutter.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class StandardMethodCodec implements MethodCodec {
    public static final StandardMethodCodec INSTANCE = new StandardMethodCodec(StandardMessageCodec.INSTANCE);
    private final StandardMessageCodec messageCodec;

    public StandardMethodCodec(StandardMessageCodec standardMessageCodec) {
        this.messageCodec = standardMessageCodec;
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public Object decodeEnvelope(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b10 = byteBuffer.get();
        if (b10 != 0) {
            if (b10 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object value = this.messageCodec.readValue(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return value;
        }
        Object value2 = this.messageCodec.readValue(byteBuffer);
        Object value3 = this.messageCodec.readValue(byteBuffer);
        Object value4 = this.messageCodec.readValue(byteBuffer);
        if ((value2 instanceof String) && ((value3 == null || (value3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new FlutterException((String) value2, (String) value3, value4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public MethodCall decodeMethodCall(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object value = this.messageCodec.readValue(byteBuffer);
        Object value2 = this.messageCodec.readValue(byteBuffer);
        if (!(value instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new MethodCall((String) value, value2);
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public ByteBuffer encodeErrorEnvelope(String str, String str2, Object obj) throws IOException {
        StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
        exposedByteArrayOutputStream.write(1);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str2);
        if (obj instanceof Throwable) {
            this.messageCodec.writeValue(exposedByteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
        } else {
            this.messageCodec.writeValue(exposedByteArrayOutputStream, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        byteBufferAllocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return byteBufferAllocateDirect;
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public ByteBuffer encodeErrorEnvelopeWithStacktrace(String str, String str2, Object obj, String str3) throws IOException {
        StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
        exposedByteArrayOutputStream.write(1);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str2);
        if (obj instanceof Throwable) {
            this.messageCodec.writeValue(exposedByteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
        } else {
            this.messageCodec.writeValue(exposedByteArrayOutputStream, obj);
        }
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str3);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        byteBufferAllocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return byteBufferAllocateDirect;
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public ByteBuffer encodeMethodCall(MethodCall methodCall) {
        StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
        this.messageCodec.writeValue(exposedByteArrayOutputStream, methodCall.method);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, methodCall.arguments);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        byteBufferAllocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return byteBufferAllocateDirect;
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public ByteBuffer encodeSuccessEnvelope(Object obj) throws IOException {
        StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
        exposedByteArrayOutputStream.write(0);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        byteBufferAllocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return byteBufferAllocateDirect;
    }
}

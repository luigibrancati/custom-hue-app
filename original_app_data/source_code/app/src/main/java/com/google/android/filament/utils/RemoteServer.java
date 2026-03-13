package com.google.android.filament.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteServer {
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ReceivedMessage {
        public ByteBuffer buffer;
        public String label;
    }

    public RemoteServer(int i10) {
        long jNCreate = nCreate(i10);
        this.mNativeObject = jNCreate;
        if (jNCreate == 0) {
            throw new IllegalStateException("Couldn't create RemoteServer");
        }
    }

    public static boolean isBinary(String str) {
        return (str == null || str.endsWith(".json")) ? false : true;
    }

    public static boolean isJson(String str) {
        return str != null && str.endsWith(".json");
    }

    private static native void nAcquireReceivedMessage(long j10, ByteBuffer byteBuffer, int i10);

    private static native long nCreate(int i10);

    private static native void nDestroy(long j10);

    private static native String nPeekIncomingLabel(long j10);

    private static native int nPeekReceivedBufferLength(long j10);

    private static native String nPeekReceivedLabel(long j10);

    public ReceivedMessage acquireReceivedMessage() {
        int iNPeekReceivedBufferLength = nPeekReceivedBufferLength(this.mNativeObject);
        if (iNPeekReceivedBufferLength == 0) {
            return null;
        }
        ReceivedMessage receivedMessage = new ReceivedMessage();
        receivedMessage.label = nPeekReceivedLabel(this.mNativeObject);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iNPeekReceivedBufferLength);
        receivedMessage.buffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        nAcquireReceivedMessage(this.mNativeObject, receivedMessage.buffer, iNPeekReceivedBufferLength);
        return receivedMessage;
    }

    public void close() {
        nDestroy(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    public void finalize() throws Throwable {
        nDestroy(this.mNativeObject);
        super.finalize();
    }

    public String peekIncomingLabel() {
        return nPeekIncomingLabel(this.mNativeObject);
    }
}

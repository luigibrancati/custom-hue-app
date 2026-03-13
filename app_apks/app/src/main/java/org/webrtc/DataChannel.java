package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class DataChannel {
    private long nativeDataChannel;
    private long nativeObserver;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        @CalledByNative("Buffer")
        public Buffer(ByteBuffer byteBuffer, boolean z10) {
            this.data = byteBuffer;
            this.binary = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Init {
        public boolean negotiated;
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public int f41643id = -1;

        @CalledByNative("Init")
        public int getId() {
            return this.f41643id;
        }

        @CalledByNative("Init")
        public int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        @CalledByNative("Init")
        public int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        @CalledByNative("Init")
        public boolean getNegotiated() {
            return this.negotiated;
        }

        @CalledByNative("Init")
        public boolean getOrdered() {
            return this.ordered;
        }

        @CalledByNative("Init")
        public String getProtocol() {
            return this.protocol;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Observer {
        @CalledByNative("Observer")
        void onBufferedAmountChange(long j10);

        @CalledByNative("Observer")
        void onMessage(Buffer buffer);

        @CalledByNative("Observer")
        void onStateChange();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    @CalledByNative
    public DataChannel(long j10) {
        this.nativeDataChannel = j10;
    }

    private void checkDataChannelExists() {
        if (this.nativeDataChannel == 0) {
            throw new IllegalStateException("DataChannel has been disposed.");
        }
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native long nativeRegisterObserver(Observer observer);

    private native boolean nativeSend(byte[] bArr, boolean z10);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j10);

    public long bufferedAmount() {
        checkDataChannelExists();
        return nativeBufferedAmount();
    }

    public void close() {
        checkDataChannelExists();
        nativeClose();
    }

    public void dispose() {
        checkDataChannelExists();
        JniCommon.nativeReleaseRef(this.nativeDataChannel);
        this.nativeDataChannel = 0L;
    }

    @CalledByNative
    public long getNativeDataChannel() {
        return this.nativeDataChannel;
    }

    public int id() {
        checkDataChannelExists();
        return nativeId();
    }

    public String label() {
        checkDataChannelExists();
        return nativeLabel();
    }

    public void registerObserver(Observer observer) {
        checkDataChannelExists();
        long j10 = this.nativeObserver;
        if (j10 != 0) {
            nativeUnregisterObserver(j10);
        }
        this.nativeObserver = nativeRegisterObserver(observer);
    }

    public boolean send(Buffer buffer) {
        checkDataChannelExists();
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return nativeSend(bArr, buffer.binary);
    }

    public State state() {
        checkDataChannelExists();
        return nativeState();
    }

    public void unregisterObserver() {
        checkDataChannelExists();
        nativeUnregisterObserver(this.nativeObserver);
        this.nativeObserver = 0L;
    }
}

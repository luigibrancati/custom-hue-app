package org.webrtc;

import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class RtpReceiver {
    private MediaStreamTrack cachedTrack;
    private long nativeObserver;
    private long nativeRtpReceiver;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Observer {
        @CalledByNative("Observer")
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    @CalledByNative
    public RtpReceiver(long j10) {
        this.nativeRtpReceiver = j10;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j10));
    }

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver == 0) {
            throw new IllegalStateException("RtpReceiver has been disposed.");
        }
    }

    private static native String nativeGetId(long j10);

    private static native RtpParameters nativeGetParameters(long j10);

    private static native long nativeGetTrack(long j10);

    private static native void nativeSetFrameDecryptor(long j10, long j11);

    private static native long nativeSetObserver(long j10, Observer observer);

    private static native void nativeUnsetObserver(long j10, long j11);

    public void SetObserver(Observer observer) {
        checkRtpReceiverExists();
        long j10 = this.nativeObserver;
        if (j10 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j10);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    @CalledByNative
    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        long j10 = this.nativeObserver;
        if (j10 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j10);
            this.nativeObserver = 0L;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0L;
    }

    public long getNativeRtpReceiver() {
        checkRtpReceiverExists();
        return this.nativeRtpReceiver;
    }

    public RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    public String id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}

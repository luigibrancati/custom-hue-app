package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public interface AudioTrackSink {
    @CalledByNative
    void onData(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, long j10);
}

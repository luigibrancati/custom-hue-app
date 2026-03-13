package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int width;

    public NV21Buffer(byte[] bArr, int i10, int i11, Runnable runnable) {
        this.data = bArr;
        this.width = i10;
        this.height = i11;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr, int i16, int i17, ByteBuffer byteBuffer, int i18, ByteBuffer byteBuffer2, int i19, ByteBuffer byteBuffer3, int i20);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i14, i15);
        nativeCropAndScale(i10, i11, i12, i13, i14, i15, this.data, this.width, this.height, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i10 = this.width;
        int i11 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i10, i11, i10, i11);
    }
}

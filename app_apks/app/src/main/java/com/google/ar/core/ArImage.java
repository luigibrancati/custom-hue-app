package com.google.ar.core;

import android.graphics.Rect;
import android.media.Image;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
class ArImage extends com.google.ar.core.dependencies.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f31083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Session f31084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31085c;

    public ArImage(Session session, long j10) {
        this.f31084b = session;
        this.f31083a = j10;
        this.f31085c = session.nativeSymbolTableHandle;
    }

    private native void nativeClose(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nativeGetBuffer, reason: merged with bridge method [inline-methods] */
    public native ByteBuffer c(long j10, long j11, int i10);

    private native int nativeGetFormat(long j10, long j11);

    private native int nativeGetHeight(long j10, long j11);

    private native int nativeGetNumberOfPlanes(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nativeGetPixelStride, reason: merged with bridge method [inline-methods] */
    public native int b(long j10, long j11, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nativeGetRowStride, reason: merged with bridge method [inline-methods] */
    public native int a(long j10, long j11, int i10);

    private native long nativeGetTimestamp(long j10, long j11);

    private native int nativeGetWidth(long j10, long j11);

    public static native void nativeLoadSymbols();

    @Override // android.media.Image, java.lang.AutoCloseable
    public final void close() {
        nativeClose(this.f31085c, this.f31083a);
        this.f31083a = 0L;
    }

    public final /* synthetic */ Session d() {
        return this.f31084b;
    }

    @Override // android.media.Image
    public final Rect getCropRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    @Override // android.media.Image
    public final int getFormat() {
        int iNativeGetFormat = nativeGetFormat(this.f31084b.nativeWrapperHandle, this.f31083a);
        if (iNativeGetFormat != -1) {
            return iNativeGetFormat;
        }
        throw new FatalException("Unknown error in ArImage.getFormat().");
    }

    @Override // android.media.Image
    public final int getHeight() {
        int iNativeGetHeight = nativeGetHeight(this.f31084b.nativeWrapperHandle, this.f31083a);
        if (iNativeGetHeight != -1) {
            return iNativeGetHeight;
        }
        throw new FatalException("Unknown error in ArImage.getHeight().");
    }

    @Override // android.media.Image
    public final Image.Plane[] getPlanes() {
        int iNativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.f31084b.nativeWrapperHandle, this.f31083a);
        if (iNativeGetNumberOfPlanes == -1) {
            throw new FatalException("Unknown error in ArImage.getPlanes().");
        }
        n[] nVarArr = new n[iNativeGetNumberOfPlanes];
        for (int i10 = 0; i10 < iNativeGetNumberOfPlanes; i10++) {
            nVarArr[i10] = new n(this, this.f31083a, i10);
        }
        return nVarArr;
    }

    @Override // android.media.Image
    public final long getTimestamp() {
        long jNativeGetTimestamp = nativeGetTimestamp(this.f31084b.nativeWrapperHandle, this.f31083a);
        if (jNativeGetTimestamp != -1) {
            return jNativeGetTimestamp;
        }
        throw new FatalException("Unknown error in ArImage.getTimestamp().");
    }

    @Override // android.media.Image
    public final int getWidth() {
        int iNativeGetWidth = nativeGetWidth(this.f31084b.nativeWrapperHandle, this.f31083a);
        if (iNativeGetWidth != -1) {
            return iNativeGetWidth;
        }
        throw new FatalException("Unknown error in ArImage.getWidth().");
    }

    @Override // android.media.Image
    public final void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    @Override // android.media.Image
    public final void setTimestamp(long j10) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}

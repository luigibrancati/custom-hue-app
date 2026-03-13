package com.google.ar.core;

import com.google.ar.core.exceptions.DeadlineExceededException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class PointCloud implements Closeable {
    private long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public PointCloud() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    private native ByteBuffer nativeGetData(long j10, long j11);

    private native ByteBuffer nativeGetIds(long j10, long j11);

    private native long nativeGetTimestamp(long j10, long j11);

    private native void nativeReleasePointCloud(long j10, long j11);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    public void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleasePointCloud(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public IntBuffer getIds() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            return Session.directByteBufferOrDefault(nativeGetIds(this.session.nativeWrapperHandle, j10)).asIntBuffer();
        }
        throw new DeadlineExceededException();
    }

    public FloatBuffer getPoints() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            return Session.directByteBufferOrDefault(nativeGetData(this.session.nativeWrapperHandle, j10)).asFloatBuffer();
        }
        throw new DeadlineExceededException();
    }

    public long getTimestamp() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            return nativeGetTimestamp(this.session.nativeWrapperHandle, j10);
        }
        throw new DeadlineExceededException();
    }

    public void release() {
        nativeReleasePointCloud(this.nativeSymbolTableHandle, this.nativeHandle);
        this.nativeHandle = 0L;
    }

    public PointCloud(Session session, long j10) {
        this.session = session;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}

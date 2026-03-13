package com.google.ar.core;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class RecordingConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public RecordingConfig() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private native void nativeAddTrack(long j10, long j11, long j12);

    private static native long nativeCreateRecordingConfig(long j10);

    private static native void nativeDestroyRecordingConfig(long j10, long j11);

    private native boolean nativeGetAutoStopOnPause(long j10, long j11);

    private native String nativeGetMp4DatasetFilePath(long j10, long j11);

    private native String nativeGetMp4DatasetUri(long j10, long j11);

    private native int nativeGetRecordingRotation(long j10, long j11);

    private native void nativeSetAutoStopOnPause(long j10, long j11, boolean z10);

    private native void nativeSetMp4DatasetFilePath(long j10, long j11, String str);

    private native void nativeSetMp4DatasetUri(long j10, long j11, String str);

    private native void nativeSetRecordingRotation(long j10, long j11, int i10);

    public RecordingConfig addTrack(Track track) {
        nativeAddTrack(this.session.nativeWrapperHandle, this.nativeHandle, track.nativeHandle);
        return this;
    }

    public void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyRecordingConfig(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public boolean getAutoStopOnPause() {
        return nativeGetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public String getMp4DatasetFilePath() {
        return nativeGetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Uri getMp4DatasetUri() {
        String strNativeGetMp4DatasetUri = nativeGetMp4DatasetUri(this.session.nativeWrapperHandle, this.nativeHandle);
        if (strNativeGetMp4DatasetUri == null) {
            return null;
        }
        return Uri.parse(strNativeGetMp4DatasetUri);
    }

    public int getRecordingRotation() {
        return nativeGetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public RecordingConfig setAutoStopOnPause(boolean z10) {
        nativeSetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle, z10);
        return this;
    }

    @Deprecated
    public RecordingConfig setMp4DatasetFilePath(String str) {
        nativeSetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    public RecordingConfig setMp4DatasetUri(Uri uri) {
        nativeSetMp4DatasetUri(this.session.nativeWrapperHandle, this.nativeHandle, uri.toString());
        return this;
    }

    public RecordingConfig setRecordingRotation(int i10) {
        nativeSetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle, i10);
        return this;
    }

    public RecordingConfig(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreateRecordingConfig(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}

package com.google.android.filament.utils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Bookmark {
    private long mNativeObject;

    public Bookmark(long j10) {
        this.mNativeObject = j10;
    }

    private static native void nDestroyBookmark(long j10);

    public void finalize() throws Throwable {
        nDestroyBookmark(this.mNativeObject);
        super.finalize();
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }
}

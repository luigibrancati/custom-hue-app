package com.google.ar.core;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
class FutureImpl implements Future {
    final long nativeCallbackContext;
    final long nativeFuture;
    final long nativeSymbolTableHandle;
    final Session session;

    public FutureImpl(Session session, long j10, long j11) {
        this.session = session;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
        this.nativeFuture = j10;
        this.nativeCallbackContext = j11;
    }

    public static native void nativeReleaseFuture(long j10, long j11);

    @Override // com.google.ar.core.Future
    public boolean cancel() {
        return nativeCancel(this.session.nativeWrapperHandle, this.nativeFuture, this.nativeCallbackContext);
    }

    public void finalize() throws Throwable {
        nativeReleaseFuture(this.nativeSymbolTableHandle, this.nativeFuture);
        super.finalize();
    }

    @Override // com.google.ar.core.Future
    public FutureState getState() {
        return FutureState.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    public native boolean nativeCancel(long j10, long j11, long j12);

    public native int nativeGetState(long j10, long j11);
}

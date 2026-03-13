package com.google.ar.core;

import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class HostCloudAnchorFuture extends FutureImpl {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class CallbackWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BiConsumer f31086a;

        public CallbackWrapper(BiConsumer biConsumer) {
            this.f31086a = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(String str, int i10) {
            this.f31086a.accept(str, Anchor.CloudAnchorState.forNumber(i10));
        }
    }

    public HostCloudAnchorFuture(Session session, long j10, long j11) {
        super(session, j10, j11);
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public String getResultCloudAnchorId() {
        return nativeGetResultCloudAnchorId(this.session.nativeWrapperHandle, this.nativeFuture);
    }

    public Anchor.CloudAnchorState getResultCloudAnchorState() {
        return Anchor.CloudAnchorState.forNumber(nativeGetResultCloudAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    public native String nativeGetResultCloudAnchorId(long j10, long j11);

    public native int nativeGetResultCloudAnchorState(long j10, long j11);
}

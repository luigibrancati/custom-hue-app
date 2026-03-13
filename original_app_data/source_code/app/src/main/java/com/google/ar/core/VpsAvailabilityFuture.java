package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class VpsAvailabilityFuture extends FutureImpl {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class CallbackWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Consumer f31102a;

        public CallbackWrapper(Consumer consumer) {
            this.f31102a = consumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(int i10) {
            this.f31102a.accept(VpsAvailability.forNumber(i10));
        }
    }

    public VpsAvailabilityFuture(Session session, long j10, long j11) {
        super(session, j10, j11);
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public VpsAvailability getResult() {
        return VpsAvailability.forNumber(nativeGetResult(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    public native int nativeGetResult(long j10, long j11);
}

package com.google.ar.core;

import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.lang.ref.WeakReference;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ResolveCloudAnchorFuture extends FutureImpl {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class CallbackWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f31099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f31100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BiConsumer f31101c;

        public CallbackWrapper(Session session, BiConsumer biConsumer) {
            this.f31099a = new WeakReference(session);
            this.f31100b = session.nativeSymbolTableHandle;
            this.f31101c = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(long j10, int i10) {
            Session session = (Session) this.f31099a.get();
            if (session != null) {
                this.f31101c.accept(ResolveCloudAnchorFuture.makeAnchor(j10, session), Anchor.CloudAnchorState.forNumber(i10));
                return;
            }
            this.f31101c.accept(null, Anchor.CloudAnchorState.ERROR_INTERNAL);
            if (j10 != 0) {
                Anchor.nativeReleaseAnchor(this.f31100b, j10);
            }
        }
    }

    public ResolveCloudAnchorFuture(Session session, long j10, long j11) {
        super(session, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Anchor makeAnchor(long j10, Session session) {
        if (j10 != 0) {
            return new Anchor(j10, session);
        }
        return null;
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public Anchor getResultAnchor() {
        return makeAnchor(nativeGetResultAnchor(this.session.nativeWrapperHandle, this.nativeFuture), this.session);
    }

    public Anchor.CloudAnchorState getResultCloudAnchorState() {
        return Anchor.CloudAnchorState.forNumber(nativeGetResultCloudAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    public native long nativeGetResultAnchor(long j10, long j11);

    public native int nativeGetResultCloudAnchorState(long j10, long j11);
}

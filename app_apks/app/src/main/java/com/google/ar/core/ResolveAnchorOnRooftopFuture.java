package com.google.ar.core;

import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.lang.ref.WeakReference;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ResolveAnchorOnRooftopFuture extends FutureImpl {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class CallbackWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f31093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f31094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BiConsumer f31095c;

        public CallbackWrapper(Session session, BiConsumer biConsumer) {
            this.f31093a = new WeakReference(session);
            this.f31094b = session.nativeSymbolTableHandle;
            this.f31095c = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(long j10, int i10) {
            Session session = (Session) this.f31093a.get();
            if (session != null) {
                this.f31095c.accept(ResolveAnchorOnRooftopFuture.makeAnchor(j10, session), Anchor.RooftopAnchorState.forNumber(i10));
                return;
            }
            this.f31095c.accept(null, Anchor.RooftopAnchorState.ERROR_INTERNAL);
            if (j10 != 0) {
                Anchor.nativeReleaseAnchor(this.f31094b, j10);
            }
        }
    }

    public ResolveAnchorOnRooftopFuture(Session session, long j10, long j11) {
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

    public Anchor.RooftopAnchorState getResultRooftopAnchorState() {
        return Anchor.RooftopAnchorState.forNumber(nativeGetResultRooftopAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    public native long nativeGetResultAnchor(long j10, long j11);

    public native int nativeGetResultRooftopAnchorState(long j10, long j11);
}

package Nb;

import Eb.t;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f10624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f10625b;

    public i(AtomicReference atomicReference, t tVar) {
        this.f10624a = atomicReference;
        this.f10625b = tVar;
    }

    @Override // Eb.t
    public void b(Hb.c cVar) {
        Kb.c.p(this.f10624a, cVar);
    }

    @Override // Eb.t
    public void onError(Throwable th) {
        this.f10625b.onError(th);
    }

    @Override // Eb.t
    public void onSuccess(Object obj) {
        this.f10625b.onSuccess(obj);
    }
}

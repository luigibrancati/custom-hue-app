package Qb;

import Eb.h;
import Eb.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f14236a;

    public b(Throwable th) {
        this.f14236a = th;
    }

    @Override // Eb.h
    public void f(i iVar) {
        iVar.b(Hb.d.a());
        iVar.onError(this.f14236a);
    }
}

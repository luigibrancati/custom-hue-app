package ue;

import gc.C4199l;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C5465a;
import pe.v;
import ue.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f45614a;

    public i(n delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f45614a = delegate;
    }

    @Override // ue.r
    public boolean a(l lVar) {
        return this.f45614a.a(lVar);
    }

    @Override // ue.r
    public C4199l b() {
        return this.f45614a.b();
    }

    @Override // ue.r
    public boolean c() {
        return this.f45614a.c();
    }

    @Override // ue.r
    public r.b d() {
        return this.f45614a.h();
    }

    @Override // ue.r
    public boolean e(v url) {
        AbstractC4862t.e(url, "url");
        return this.f45614a.e(url);
    }

    @Override // ue.r
    public C5465a getAddress() {
        return this.f45614a.getAddress();
    }
}

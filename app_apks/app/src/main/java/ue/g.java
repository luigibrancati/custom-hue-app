package ue;

import kotlin.jvm.internal.AbstractC4862t;
import ue.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.a f45604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45605b;

    public g(Throwable e10) {
        AbstractC4862t.e(e10, "e");
        this.f45604a = new r.a(this, null, e10, 2, null);
    }

    @Override // ue.r.b
    public /* bridge */ /* synthetic */ l a() {
        return (l) e();
    }

    @Override // ue.r.b, ve.d.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    public final r.a c() {
        return this.f45604a;
    }

    @Override // ue.r.b
    public r.a d() {
        return this.f45604a;
    }

    public Void e() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // ue.r.b
    public /* bridge */ /* synthetic */ r.b f() {
        return (r.b) h();
    }

    @Override // ue.r.b
    public r.a g() {
        return this.f45604a;
    }

    public Void h() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // ue.r.b
    public boolean isReady() {
        return this.f45605b;
    }
}

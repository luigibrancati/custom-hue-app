package ue;

import kotlin.jvm.internal.AbstractC4862t;
import ue.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f45687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45688b;

    public p(l connection) {
        AbstractC4862t.e(connection, "connection");
        this.f45687a = connection;
        this.f45688b = true;
    }

    @Override // ue.r.b
    public l a() {
        return this.f45687a;
    }

    @Override // ue.r.b, ve.d.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    public Void c() {
        throw new IllegalStateException("already connected");
    }

    @Override // ue.r.b
    public /* bridge */ /* synthetic */ r.a d() {
        return (r.a) e();
    }

    public Void e() {
        throw new IllegalStateException("already connected");
    }

    @Override // ue.r.b
    public /* bridge */ /* synthetic */ r.b f() {
        return (r.b) i();
    }

    @Override // ue.r.b
    public /* bridge */ /* synthetic */ r.a g() {
        return (r.a) c();
    }

    public final l h() {
        return this.f45687a;
    }

    public Void i() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // ue.r.b
    public boolean isReady() {
        return this.f45688b;
    }
}

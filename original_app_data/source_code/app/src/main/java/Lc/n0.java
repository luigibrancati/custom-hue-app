package Lc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8769b;

    public n0(String name, boolean z10) {
        AbstractC4862t.e(name, "name");
        this.f8768a = name;
        this.f8769b = z10;
    }

    public Integer a(n0 visibility) {
        AbstractC4862t.e(visibility, "visibility");
        return m0.f8756a.a(this, visibility);
    }

    public String b() {
        return this.f8768a;
    }

    public final boolean c() {
        return this.f8769b;
    }

    public final String toString() {
        return b();
    }

    public n0 d() {
        return this;
    }
}

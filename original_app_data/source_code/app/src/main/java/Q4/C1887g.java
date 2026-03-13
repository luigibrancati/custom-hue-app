package Q4;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1887g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Task f13858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.l f13861d;

    public C1887g(Task task, String method, Object arg, vc.l lVar) {
        AbstractC4862t.e(task, "task");
        AbstractC4862t.e(method, "method");
        AbstractC4862t.e(arg, "arg");
        this.f13858a = task;
        this.f13859b = method;
        this.f13860c = arg;
        this.f13861d = lVar;
    }

    public final Object a() {
        return this.f13860c;
    }

    public final String b() {
        return this.f13859b;
    }

    public final vc.l c() {
        return this.f13861d;
    }

    public final Task d() {
        return this.f13858a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1887g)) {
            return false;
        }
        C1887g c1887g = (C1887g) obj;
        return AbstractC4862t.a(this.f13858a, c1887g.f13858a) && AbstractC4862t.a(this.f13859b, c1887g.f13859b) && AbstractC4862t.a(this.f13860c, c1887g.f13860c) && AbstractC4862t.a(this.f13861d, c1887g.f13861d);
    }

    public int hashCode() {
        int iHashCode = ((((this.f13858a.hashCode() * 31) + this.f13859b.hashCode()) * 31) + this.f13860c.hashCode()) * 31;
        vc.l lVar = this.f13861d;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public String toString() {
        return "BackgroundPost(task=" + this.f13858a + ", method=" + this.f13859b + ", arg=" + this.f13860c + ", onFail=" + this.f13861d + ")";
    }
}

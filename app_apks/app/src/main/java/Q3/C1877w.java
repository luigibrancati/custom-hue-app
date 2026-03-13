package Q3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q3.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1877w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13745b;

    public C1877w(String workSpecId, int i10) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        this.f13744a = workSpecId;
        this.f13745b = i10;
    }

    public final int a() {
        return this.f13745b;
    }

    public final String b() {
        return this.f13744a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1877w)) {
            return false;
        }
        C1877w c1877w = (C1877w) obj;
        return AbstractC4862t.a(this.f13744a, c1877w.f13744a) && this.f13745b == c1877w.f13745b;
    }

    public int hashCode() {
        return (this.f13744a.hashCode() * 31) + Integer.hashCode(this.f13745b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f13744a + ", generation=" + this.f13745b + ')';
    }
}

package Q3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q3.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1870o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13717c;

    public C1870o(String workSpecId, int i10, int i11) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        this.f13715a = workSpecId;
        this.f13716b = i10;
        this.f13717c = i11;
    }

    public final int a() {
        return this.f13716b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1870o)) {
            return false;
        }
        C1870o c1870o = (C1870o) obj;
        return AbstractC4862t.a(this.f13715a, c1870o.f13715a) && this.f13716b == c1870o.f13716b && this.f13717c == c1870o.f13717c;
    }

    public int hashCode() {
        return (((this.f13715a.hashCode() * 31) + Integer.hashCode(this.f13716b)) * 31) + Integer.hashCode(this.f13717c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f13715a + ", generation=" + this.f13716b + ", systemId=" + this.f13717c + ')';
    }
}

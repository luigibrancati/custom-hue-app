package p9;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42314d;

    public C(String processName, int i10, int i11, boolean z10) {
        AbstractC4862t.e(processName, "processName");
        this.f42311a = processName;
        this.f42312b = i10;
        this.f42313c = i11;
        this.f42314d = z10;
    }

    public final int a() {
        return this.f42313c;
    }

    public final int b() {
        return this.f42312b;
    }

    public final String c() {
        return this.f42311a;
    }

    public final boolean d() {
        return this.f42314d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return AbstractC4862t.a(this.f42311a, c10.f42311a) && this.f42312b == c10.f42312b && this.f42313c == c10.f42313c && this.f42314d == c10.f42314d;
    }

    public int hashCode() {
        return (((((this.f42311a.hashCode() * 31) + Integer.hashCode(this.f42312b)) * 31) + Integer.hashCode(this.f42313c)) * 31) + Boolean.hashCode(this.f42314d);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f42311a + ", pid=" + this.f42312b + ", importance=" + this.f42313c + ", isDefaultProcess=" + this.f42314d + ')';
    }
}

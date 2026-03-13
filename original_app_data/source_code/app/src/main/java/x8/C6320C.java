package x8;

import r8.C5677f;
import x8.G;

/* JADX INFO: renamed from: x8.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6320C extends G.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5677f f47525f;

    public C6320C(String str, String str2, String str3, String str4, int i10, C5677f c5677f) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f47520a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f47521b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f47522c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f47523d = str4;
        this.f47524e = i10;
        if (c5677f == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f47525f = c5677f;
    }

    @Override // x8.G.a
    public String a() {
        return this.f47520a;
    }

    @Override // x8.G.a
    public int c() {
        return this.f47524e;
    }

    @Override // x8.G.a
    public C5677f d() {
        return this.f47525f;
    }

    @Override // x8.G.a
    public String e() {
        return this.f47523d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.a) {
            G.a aVar = (G.a) obj;
            if (this.f47520a.equals(aVar.a()) && this.f47521b.equals(aVar.f()) && this.f47522c.equals(aVar.g()) && this.f47523d.equals(aVar.e()) && this.f47524e == aVar.c() && this.f47525f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.G.a
    public String f() {
        return this.f47521b;
    }

    @Override // x8.G.a
    public String g() {
        return this.f47522c;
    }

    public int hashCode() {
        return this.f47525f.hashCode() ^ ((((((((((this.f47520a.hashCode() ^ 1000003) * 1000003) ^ this.f47521b.hashCode()) * 1000003) ^ this.f47522c.hashCode()) * 1000003) ^ this.f47523d.hashCode()) * 1000003) ^ this.f47524e) * 1000003);
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f47520a + ", versionCode=" + this.f47521b + ", versionName=" + this.f47522c + ", installUuid=" + this.f47523d + ", deliveryMechanism=" + this.f47524e + ", developmentPlatformProvider=" + this.f47525f + "}";
    }
}

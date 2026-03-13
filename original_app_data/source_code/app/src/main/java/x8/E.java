package x8;

import x8.G;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends G.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47537c;

    public E(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f47535a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f47536b = str2;
        this.f47537c = z10;
    }

    @Override // x8.G.c
    public boolean b() {
        return this.f47537c;
    }

    @Override // x8.G.c
    public String c() {
        return this.f47536b;
    }

    @Override // x8.G.c
    public String d() {
        return this.f47535a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.c) {
            G.c cVar = (G.c) obj;
            if (this.f47535a.equals(cVar.d()) && this.f47536b.equals(cVar.c()) && this.f47537c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f47537c ? 1231 : 1237) ^ ((((this.f47535a.hashCode() ^ 1000003) * 1000003) ^ this.f47536b.hashCode()) * 1000003);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f47535a + ", osCodeName=" + this.f47536b + ", isRooted=" + this.f47537c + "}";
    }
}

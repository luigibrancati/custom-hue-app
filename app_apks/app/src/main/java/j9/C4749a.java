package j9;

/* JADX INFO: renamed from: j9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4749a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39098b;

    public C4749a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f39097a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f39098b = str2;
    }

    @Override // j9.f
    public String b() {
        return this.f39097a;
    }

    @Override // j9.f
    public String c() {
        return this.f39098b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f39097a.equals(fVar.b()) && this.f39098b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f39098b.hashCode() ^ ((this.f39097a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f39097a + ", version=" + this.f39098b + "}";
    }
}

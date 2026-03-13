package K;

import K.C0980w;

/* JADX INFO: renamed from: K.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0961c extends C0980w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U.z f6595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6596b;

    public C0961c(U.z zVar, int i10) {
        if (zVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f6595a = zVar;
        this.f6596b = i10;
    }

    @Override // K.C0980w.a
    public int a() {
        return this.f6596b;
    }

    @Override // K.C0980w.a
    public U.z b() {
        return this.f6595a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0980w.a) {
            C0980w.a aVar = (C0980w.a) obj;
            if (this.f6595a.equals(aVar.b()) && this.f6596b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6596b ^ ((this.f6595a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "In{packet=" + this.f6595a + ", jpegQuality=" + this.f6596b + "}";
    }
}

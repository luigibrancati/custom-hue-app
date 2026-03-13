package K;

import K.C0965g;

/* JADX INFO: renamed from: K.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0959a extends C0965g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U.z f6576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6577b;

    public C0959a(U.z zVar, int i10) {
        if (zVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f6576a = zVar;
        this.f6577b = i10;
    }

    @Override // K.C0965g.b
    public int a() {
        return this.f6577b;
    }

    @Override // K.C0965g.b
    public U.z b() {
        return this.f6576a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0965g.b) {
            C0965g.b bVar = (C0965g.b) obj;
            if (this.f6576a.equals(bVar.b()) && this.f6577b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6577b ^ ((this.f6576a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "In{packet=" + this.f6576a + ", jpegQuality=" + this.f6577b + "}";
    }
}

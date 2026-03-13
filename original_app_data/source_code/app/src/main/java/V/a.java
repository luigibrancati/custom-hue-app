package V;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W.f f17135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W.f f17136b;

    public a(W.f fVar, W.f fVar2) {
        if (fVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f17135a = fVar;
        if (fVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f17136b = fVar2;
    }

    @Override // V.d
    public W.f a() {
        return this.f17135a;
    }

    @Override // V.d
    public W.f b() {
        return this.f17136b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f17135a.equals(dVar.a()) && this.f17136b.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f17136b.hashCode() ^ ((this.f17135a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f17135a + ", secondaryOutConfig=" + this.f17136b + "}";
    }
}

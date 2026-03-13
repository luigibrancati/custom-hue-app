package E;

import E.AbstractC0819w;

/* JADX INFO: renamed from: E.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0784e extends AbstractC0819w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0819w.b f2972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0819w.a f2973b;

    public C0784e(AbstractC0819w.b bVar, AbstractC0819w.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f2972a = bVar;
        this.f2973b = aVar;
    }

    @Override // E.AbstractC0819w
    public AbstractC0819w.a c() {
        return this.f2973b;
    }

    @Override // E.AbstractC0819w
    public AbstractC0819w.b d() {
        return this.f2972a;
    }

    public boolean equals(Object obj) {
        AbstractC0819w.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0819w) {
            AbstractC0819w abstractC0819w = (AbstractC0819w) obj;
            if (this.f2972a.equals(abstractC0819w.d()) && ((aVar = this.f2973b) != null ? aVar.equals(abstractC0819w.c()) : abstractC0819w.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f2972a.hashCode() ^ 1000003) * 1000003;
        AbstractC0819w.a aVar = this.f2973b;
        return (aVar == null ? 0 : aVar.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "CameraState{type=" + this.f2972a + ", error=" + this.f2973b + "}";
    }
}

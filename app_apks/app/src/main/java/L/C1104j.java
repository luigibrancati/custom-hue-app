package L;

/* JADX INFO: renamed from: L.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1104j extends AbstractC1124t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8090a;

    public C1104j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f8090a = obj;
    }

    @Override // L.AbstractC1124t0
    public Object b() {
        return this.f8090a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1124t0) {
            return this.f8090a.equals(((AbstractC1124t0) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8090a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f8090a + "}";
    }
}

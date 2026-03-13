package K7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends AbstractC1085z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object f7628c;

    public V(Object obj) {
        this.f7628c = J7.n.j(obj);
    }

    @Override // K7.AbstractC1085z, K7.AbstractC1079t
    public AbstractC1081v c() {
        return AbstractC1081v.A(this.f7628c);
    }

    @Override // K7.AbstractC1079t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f7628c.equals(obj);
    }

    @Override // K7.AbstractC1079t
    public int d(Object[] objArr, int i10) {
        objArr[i10] = this.f7628c;
        return i10 + 1;
    }

    @Override // K7.AbstractC1085z, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7628c.hashCode();
    }

    @Override // K7.AbstractC1079t
    public boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l */
    public Y iterator() {
        return B.s(this.f7628c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f7628c.toString() + ']';
    }
}

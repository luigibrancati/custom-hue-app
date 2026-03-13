package Bc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f788b;

    public a(double d10, double d11) {
        this.f787a = d10;
        this.f788b = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Bc.c
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return b(((Number) comparable).doubleValue());
    }

    public boolean b(double d10) {
        return d10 >= this.f787a && d10 <= this.f788b;
    }

    public boolean c() {
        return this.f787a > this.f788b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (c() && ((a) obj).c()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f787a == aVar.f787a && this.f788b == aVar.f788b;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (Double.hashCode(this.f787a) * 31) + Double.hashCode(this.f788b);
    }

    public String toString() {
        return this.f787a + ".." + this.f788b;
    }
}

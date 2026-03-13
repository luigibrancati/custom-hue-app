package J1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5863a;

    public final boolean A() {
        return u(67108864);
    }

    public final void B(int i10) {
        this.f5863a = i10;
    }

    public final void q(int i10) {
        this.f5863a = i10 | this.f5863a;
    }

    public void s() {
        this.f5863a = 0;
    }

    public final boolean u(int i10) {
        return (this.f5863a & i10) == i10;
    }

    public final boolean v() {
        return u(268435456);
    }

    public final boolean w() {
        return u(4);
    }

    public final boolean x() {
        return u(134217728);
    }

    public final boolean y() {
        return u(1);
    }

    public final boolean z() {
        return u(536870912);
    }
}

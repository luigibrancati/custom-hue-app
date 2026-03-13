package X6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C6 extends AbstractC2514v6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18194c;

    public C6(R6 r62) {
        super(r62);
        this.f19261b.e0();
    }

    public final boolean i() {
        return this.f18194c;
    }

    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f18194c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f19261b.f0();
        this.f18194c = true;
    }

    public abstract boolean l();
}

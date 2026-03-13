package X6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class M3 extends L3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18414b;

    public M3(C2416j3 c2416j3) {
        super(c2416j3);
        this.f18400a.k();
    }

    public abstract boolean i();

    public final boolean k() {
        return this.f18414b;
    }

    public final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f18414b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.f18400a.l();
        this.f18414b = true;
    }

    public final void n() {
        if (this.f18414b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f18400a.l();
        this.f18414b = true;
    }

    public void j() {
    }
}

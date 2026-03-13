package X6;

/* JADX INFO: renamed from: X6.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2399h2 extends G1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18963b;

    public AbstractC2399h2(C2416j3 c2416j3) {
        super(c2416j3);
        this.f18400a.k();
    }

    public final boolean i() {
        return this.f18963b;
    }

    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f18963b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.f18400a.l();
        this.f18963b = true;
    }

    public final void l() {
        if (this.f18963b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.f18400a.l();
        this.f18963b = true;
    }

    public abstract boolean m();

    public void n() {
    }
}

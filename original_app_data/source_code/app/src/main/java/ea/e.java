package ea;

import Eb.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f33891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3973a f33893c;

    public e(d dVar) {
        this.f33891a = dVar;
    }

    private void Q0() {
        C3973a c3973a;
        while (true) {
            synchronized (this) {
                try {
                    c3973a = this.f33893c;
                    if (c3973a == null) {
                        this.f33892b = false;
                        return;
                    }
                    this.f33893c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c3973a.a(this.f33891a);
        }
    }

    @Override // ea.d
    public boolean O0() {
        return this.f33891a.O0();
    }

    @Override // ea.d, Jb.d
    public void accept(Object obj) {
        synchronized (this) {
            try {
                if (!this.f33892b) {
                    this.f33892b = true;
                    this.f33891a.accept(obj);
                    Q0();
                } else {
                    C3973a c3973a = this.f33893c;
                    if (c3973a == null) {
                        c3973a = new C3973a(4);
                        this.f33893c = c3973a;
                    }
                    c3973a.b(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Eb.k
    public void v0(p pVar) {
        this.f33891a.f(pVar);
    }
}

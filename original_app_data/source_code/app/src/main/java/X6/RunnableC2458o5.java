package X6;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.o5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2458o5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W6 f19145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U5 f19146d;

    public RunnableC2458o5(U5 u52, c7 c7Var, boolean z10, W6 w62) {
        this.f19143a = c7Var;
        this.f19144b = z10;
        this.f19145c = w62;
        Objects.requireNonNull(u52);
        this.f19146d = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f19146d;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        c7 c7Var = this.f19143a;
        AbstractC6056k.l(c7Var);
        u52.b0(interfaceC2407i2N, this.f19144b ? null : this.f19145c, c7Var);
        u52.J();
    }
}

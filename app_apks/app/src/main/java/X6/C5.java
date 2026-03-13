package X6;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f18190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2404i f18192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U5 f18193d;

    public C5(U5 u52, boolean z10, c7 c7Var, boolean z11, C2404i c2404i, C2404i c2404i2) {
        this.f18190a = c7Var;
        this.f18191b = z11;
        this.f18192c = c2404i;
        Objects.requireNonNull(u52);
        this.f18193d = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f18193d;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        c7 c7Var = this.f18190a;
        AbstractC6056k.l(c7Var);
        u52.b0(interfaceC2407i2N, this.f18191b ? null : this.f18192c, c7Var);
        u52.J();
    }
}

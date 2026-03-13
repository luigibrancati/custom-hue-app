package X6;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f18169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f18171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U5 f18172d;

    public B5(U5 u52, boolean z10, c7 c7Var, boolean z11, I i10, String str) {
        this.f18169a = c7Var;
        this.f18170b = z11;
        this.f18171c = i10;
        Objects.requireNonNull(u52);
        this.f18172d = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f18172d;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().o().a("Discarding data. Failed to send event to service");
            return;
        }
        c7 c7Var = this.f18169a;
        AbstractC6056k.l(c7Var);
        u52.b0(interfaceC2407i2N, this.f18170b ? null : this.f18171c, c7Var);
        u52.J();
    }
}

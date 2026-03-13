package X6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f18313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H2 f18314b;

    public G2(H2 h22, boolean z10) {
        this.f18313a = z10;
        Objects.requireNonNull(h22);
        this.f18314b = h22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18314b.c().s0(this.f18313a);
    }
}

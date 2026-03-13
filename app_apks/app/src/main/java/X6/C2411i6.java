package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.i6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2411i6 extends AbstractC2539z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2427k6 f18997e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2411i6(C2427k6 c2427k6, N3 n32) {
        super(n32);
        Objects.requireNonNull(c2427k6);
        this.f18997e = c2427k6;
    }

    @Override // X6.AbstractC2539z
    public final void a() {
        C2427k6 c2427k6 = this.f18997e;
        C2443m6 c2443m6 = c2427k6.f19071d;
        c2443m6.h();
        C2416j3 c2416j3 = c2443m6.f18400a;
        c2427k6.d(false, false, c2416j3.e().c());
        c2443m6.f18400a.M().k(c2416j3.e().c());
    }
}

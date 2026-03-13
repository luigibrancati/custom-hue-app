package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.b4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2353b4 extends AbstractC2539z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R4 f18712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2353b4(R4 r42, N3 n32) {
        super(n32);
        Objects.requireNonNull(r42);
        this.f18712e = r42;
    }

    @Override // X6.AbstractC2539z
    public final void a() {
        final R4 r4B = this.f18712e.f18400a.B();
        Objects.requireNonNull(r4B);
        new Thread(new Runnable() { // from class: X6.a4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                r4B.u0();
            }
        }).start();
    }
}

package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.t6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2498t6 extends AbstractC2539z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2506u6 f19233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2498t6(C2506u6 c2506u6, N3 n32) {
        super(n32);
        Objects.requireNonNull(c2506u6);
        this.f19233e = c2506u6;
    }

    @Override // X6.AbstractC2539z
    public final void a() {
        C2506u6 c2506u6 = this.f19233e;
        c2506u6.n();
        c2506u6.f18400a.a().w().a("Starting upload from DelayedRunnable");
        c2506u6.f19261b.r();
    }
}

package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.y5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2537y5 extends AbstractC2539z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U5 f19323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2537y5(U5 u52, N3 n32) {
        super(n32);
        Objects.requireNonNull(u52);
        this.f19323e = u52;
    }

    @Override // X6.AbstractC2539z
    public final void a() {
        this.f19323e.f18400a.a().r().a("Tasks have been queued for a long time");
    }
}

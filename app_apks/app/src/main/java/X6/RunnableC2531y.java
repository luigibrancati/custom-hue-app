package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2531y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N3 f19313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2539z f19314b;

    public RunnableC2531y(AbstractC2539z abstractC2539z, N3 n32) {
        this.f19313a = n32;
        Objects.requireNonNull(abstractC2539z);
        this.f19314b = abstractC2539z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3 n32 = this.f19313a;
        n32.c();
        if (C2380f.a()) {
            n32.b().t(this);
            return;
        }
        AbstractC2539z abstractC2539z = this.f19314b;
        boolean zC = abstractC2539z.c();
        abstractC2539z.e(0L);
        if (zC) {
            abstractC2539z.a();
        }
    }
}

package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.z4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2544z4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f19346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f19347b;

    public RunnableC2544z4(R4 r42, Boolean bool) {
        this.f19346a = bool;
        Objects.requireNonNull(r42);
        this.f19347b = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19347b.W(this.f19346a, true);
    }
}

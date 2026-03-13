package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.f5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2386f5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2426k5 f18944a;

    public RunnableC2386f5(C2426k5 c2426k5) {
        Objects.requireNonNull(c2426k5);
        this.f18944a = c2426k5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2426k5 c2426k5 = this.f18944a;
        c2426k5.f19060e = c2426k5.D();
    }
}

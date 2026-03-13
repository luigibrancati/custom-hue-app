package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.h5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2402h5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2362c5 f18971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2426k5 f18973c;

    public RunnableC2402h5(C2426k5 c2426k5, C2362c5 c2362c5, long j10) {
        this.f18971a = c2362c5;
        this.f18972b = j10;
        Objects.requireNonNull(c2426k5);
        this.f18973c = c2426k5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2426k5 c2426k5 = this.f18973c;
        c2426k5.C(this.f18971a, false, this.f18972b);
        c2426k5.f19060e = null;
        c2426k5.f18400a.J().u(null);
    }
}

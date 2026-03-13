package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.i4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2409i4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f18991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f18992b;

    public RunnableC2409i4(R4 r42, long j10) {
        this.f18991a = j10;
        Objects.requireNonNull(r42);
        this.f18992b = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2416j3 c2416j3 = this.f18992b.f18400a;
        K2 k22 = c2416j3.x().f18431l;
        long j10 = this.f18991a;
        k22.b(j10);
        c2416j3.a().v().b("Session timeout duration set", Long.valueOf(j10));
    }
}

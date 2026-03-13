package X6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S3 f18186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R4 f18189d;

    public C4(R4 r42, S3 s32, long j10, boolean z10) {
        this.f18186a = s32;
        this.f18187b = j10;
        this.f18188c = z10;
        Objects.requireNonNull(r42);
        this.f18189d = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R4 r42 = this.f18189d;
        S3 s32 = this.f18186a;
        r42.o(s32);
        r42.X(s32, this.f18187b, false, this.f18188c);
    }
}

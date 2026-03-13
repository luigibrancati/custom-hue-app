package X6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S3 f18165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R4 f18168d;

    public B4(R4 r42, S3 s32, long j10, boolean z10) {
        this.f18165a = s32;
        this.f18166b = j10;
        this.f18167c = z10;
        Objects.requireNonNull(r42);
        this.f18168d = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R4 r42 = this.f18168d;
        S3 s32 = this.f18165a;
        r42.o(s32);
        r42.X(s32, this.f18166b, true, this.f18167c);
    }
}

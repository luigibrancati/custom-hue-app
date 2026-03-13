package X6;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X6.s4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2488s4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f19212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R4 f19216e;

    public RunnableC2488s4(R4 r42, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f19212a = atomicReference;
        this.f19213b = str2;
        this.f19214c = str3;
        this.f19215d = z10;
        Objects.requireNonNull(r42);
        this.f19216e = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19216e.f18400a.J().g0(this.f19212a, null, this.f19213b, this.f19214c, this.f19215d);
    }
}

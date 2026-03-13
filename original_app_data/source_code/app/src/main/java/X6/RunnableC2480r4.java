package X6;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X6.r4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2480r4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f19185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R4 f19188d;

    public RunnableC2480r4(R4 r42, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f19185a = atomicReference;
        this.f19186b = str2;
        this.f19187c = str3;
        Objects.requireNonNull(r42);
        this.f19188d = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19188d.f18400a.J().e0(this.f19185a, null, this.f19186b, this.f19187c);
    }
}

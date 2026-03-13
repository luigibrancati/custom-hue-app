package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2378e5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2362c5 f18807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2362c5 f18808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f18809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2426k5 f18811e;

    public RunnableC2378e5(C2426k5 c2426k5, C2362c5 c2362c5, C2362c5 c2362c52, long j10, boolean z10) {
        this.f18807a = c2362c5;
        this.f18808b = c2362c52;
        this.f18809c = j10;
        this.f18810d = z10;
        Objects.requireNonNull(c2426k5);
        this.f18811e = c2426k5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18811e.B(this.f18807a, this.f18808b, this.f18809c, this.f18810d, null);
    }
}

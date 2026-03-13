package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.l4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2433l4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R4 f19084e;

    public RunnableC2433l4(R4 r42, String str, String str2, Object obj, long j10) {
        this.f19080a = str;
        this.f19081b = str2;
        this.f19082c = obj;
        this.f19083d = j10;
        Objects.requireNonNull(r42);
        this.f19084e = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19084e.B(this.f19080a, this.f19081b, this.f19082c, this.f19083d);
    }
}

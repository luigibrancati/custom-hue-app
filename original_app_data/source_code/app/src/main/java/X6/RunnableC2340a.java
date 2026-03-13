package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2340a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E0 f18681c;

    public RunnableC2340a(E0 e02, String str, long j10) {
        this.f18679a = str;
        this.f18680b = j10;
        Objects.requireNonNull(e02);
        this.f18681c = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18681c.l(this.f18679a, this.f18680b);
    }
}

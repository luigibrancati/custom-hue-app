package X6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S6 f18309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R6 f18310b;

    public F6(R6 r62, S6 s62) {
        this.f18309a = s62;
        Objects.requireNonNull(r62);
        this.f18310b = r62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R6 r62 = this.f18310b;
        r62.u0(this.f18309a);
        r62.A0();
    }
}

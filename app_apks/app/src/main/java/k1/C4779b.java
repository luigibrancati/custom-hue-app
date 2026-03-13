package k1;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: k1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4779b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f39189a;

    public C4779b(boolean z10) {
        this.f39189a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f39189a.get();
    }

    public final void b(boolean z10) {
        this.f39189a.set(z10);
    }
}

package u6;

import java.util.Objects;

/* JADX INFO: renamed from: u6.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5977w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5919A f45226a;

    public RunnableC5977w(C5919A c5919a) {
        Objects.requireNonNull(c5919a);
        this.f45226a = c5919a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45226a.F();
    }
}
